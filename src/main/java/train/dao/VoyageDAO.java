package train.dao;

import java.util.ArrayList;
import java.util.List;

import train.bo.Voyage;

public class VoyageDAO {

    private List<Voyage> voyages = new ArrayList<>();

    private static VoyageDAO instance;

    public synchronized static VoyageDAO getInstance() {
        if (instance == null) {
            instance = new VoyageDAO();
        }
        return instance;
    }

    public Voyage createVoyage(Voyage voyage) {
        try {
            this.voyages.add(voyage);
            return voyage;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de l'ajout du voyage.");

        }
        return voyage;
    }

    public boolean updateVoyage(Voyage voyageAUpdate) {
        try {

            this.voyages.stream()
                    .filter(voyage -> voyage.getNumero().equals(voyageAUpdate.getNumero()))
                    .findFirst()
                    .ifPresent(voyage -> voyages.remove(voyage));
            this.voyages.add(voyageAUpdate);

            return false;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la mise à jour du voyage.");
        }
        return false;
    }

    public boolean deleteVoyage(String voyageId) {
        try {
            this.voyages.stream()
                    .filter(voyage -> voyage.getNumero().equals(voyageId))
                    .findFirst()
                    .ifPresent(voyage -> voyages.remove(voyage));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la suppression du voyage.");

        }
        return false;
    }

    public Voyage getVoyageById(String voyageId) {
        try {
            return voyages.stream().filter(voyage -> voyage.getNumero().equals(voyageId))
                    .findFirst().orElse(null);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la selection du voyage.");

        }
        return null;
    }

    public List<Voyage> getAllVoyages() {
        return voyages;
    }
}
