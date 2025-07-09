package train;

import java.time.Instant;

import train.bo.Gare;
import train.bo.Statut;
import train.bo.Voyage;
import train.bo.train.Train;
import train.bo.train.TypeTrain;
import train.service.VoyageService;

public class mainTrain {
    public static void main(String[] args) {

        VoyageService voyageService = new VoyageService();

        // Example usage of VoyageService methods
        // Add a gare
        Gare gareArrivee = voyageService.ajouterGare("G001", "Gare Centrale", "Paris", "France");
        Gare gareDepart = voyageService.ajouterGare("G001", "Gare Nord", "Rennes", "France");

        // Add a train construction
        Train train = voyageService.ajouterTrainConstruction("T001", TypeTrain.TGV, 1000.0f);
        // Add a train voyageur
        //voyageService.ajouterTrainVoyageur("T002", TypeTrain.TGV, 300);
        // Add a voyage
        Voyage voyage = voyageService.ajouterVoyage("V001", gareDepart, gareArrivee, Instant.now(), Instant.now(), 0, train,
                Statut.EN_ROUTE);

        // Print the voyage details
        System.out.println("Voyage Number: " + voyage.getNumero() +" starting from " + voyage.getGareDepart().getNom() +
                " to " + voyage.getGareArrivee().getNom() + " on train " + voyage.getTrain().getNumero()+" "+ voyage.getRetard());

    }
}
