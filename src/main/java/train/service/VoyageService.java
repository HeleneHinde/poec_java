package train.service;

import java.time.Instant;

import train.bo.Gare;
import train.bo.Statut;
import train.bo.Voyage;
import train.bo.train.ITrain;
import train.bo.train.Train;
import train.bo.train.TrainConstruction;
import train.bo.train.TrainVoyageur;
import train.bo.train.TypeTrain;
import train.dao.GareDAO;
import train.dao.TrainDAO;
import train.dao.VoyageDAO;

public class VoyageService {

    private final TrainDAO trainDAO;
    private final GareDAO gareDAO;
    private final VoyageDAO voyageDAO;

    public VoyageService() {
        trainDAO = TrainDAO.getInstance();
        gareDAO = GareDAO.getInstance();
        voyageDAO = VoyageDAO.getInstance();
    }

    public Train ajouterTrainConstruction(String numero, TypeTrain type, float poidsTonnes) {
        return trainDAO.createTrain(new TrainConstruction(numero, type, poidsTonnes));
    }

    public Train ajouterTrainVoyageur(String numero, TypeTrain type, int nbSiege) {
        return trainDAO.createTrain(new TrainVoyageur(numero, type, nbSiege));
    }

    public Gare ajouterGare(String numero, String nom, String ville, String pays) {
        return gareDAO.createGare(new Gare(numero, nom, ville, pays));
    }

    /*
     * ajout de voyage sans gare et train
     */
    public Voyage ajouterVoyage(Instant dateDepart,
            Instant dateArrivee, int retardMinutes, Statut etat) {

        Gare gareDepart = this.ajouterGare("1", "Europole", "Rennes", "France");
        Gare gareArrive = this.ajouterGare("2", "Montparnasse", "Paris", "France");
        ITrain trainVoyageur = this.ajouterTrainVoyageur("20", TypeTrain.TGV, 500);

        Voyage voyage = voyageDAO
                .createVoyage(new Voyage(dateDepart, dateArrivee, gareDepart, gareArrive, retardMinutes,
                        trainVoyageur, etat));

        trainVoyageur.getVoyages().add(voyage);
        return voyage;
    }

    public Voyage ajouterVoyage(Gare gareDepart, Gare gareArrivee, Instant dateDepart,
            Instant dateArrivee, int retardMinutes, ITrain train, Statut etat) {

        Voyage voyage = voyageDAO.createVoyage(
                new Voyage(dateDepart, dateArrivee, gareDepart, gareArrivee, retardMinutes, train, etat));

        train.getVoyages().add(voyage);
        return voyage;
    }

    public boolean supprimerTrainEtVoyage(Train train) {

        if (train.getVoyages() != null && !train.getVoyages().isEmpty()) {
            train.getVoyages().forEach(voyage -> {
                voyageDAO.deleteVoyage(voyage.getNumero());
            });
        }

        return trainDAO.deleteTrain(train.getNumero());
    }

    public boolean supprimerGareEtVoyage(Gare gare) {

        if (gare.getVoyages() != null && !gare.getVoyages().isEmpty()) {
            gare.getVoyages().forEach(voyage -> {
                voyageDAO.deleteVoyage(voyage.getNumero());
            });
        }

        return trainDAO.deleteTrain(gare.getCodeGare());
    }

    public boolean supprimerVoyage(Voyage voyage) {
        if (voyage.getTrain() != null) {
            voyage.getTrain().getVoyages().remove(voyage);
        }
        if (voyage.getGareArrivee() != null) {
            voyage.getGareArrivee().getVoyages().remove(voyage);
        }

        if (voyage.getGareDepart() != null) {
            voyage.getGareDepart().getVoyages().remove(voyage);
        }
        return voyageDAO.deleteVoyage(voyage.getNumero());
    }

}
