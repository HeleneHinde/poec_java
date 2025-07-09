package train.dao;

import java.util.ArrayList;
import java.util.List;

import train.bo.Gare;

public class GareDAO {

    private List<Gare> gares = new ArrayList<>();

    private static GareDAO instance;

    GareDAO() {

    }

    public synchronized static GareDAO getInstance() {
        if (instance == null) {
            instance = new GareDAO();
        }
        return instance;
    }

    public Gare createGare(Gare gare) {
        try {
            this.gares.add(gare);
            return gare;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de l'ajout de la gare.");

        }
        return gare;
    }

    public boolean updateGare(Gare gareAUpdate) {
        try {

            this.gares.stream()
                    .filter(gare -> gare.getCodeGare().equals(gareAUpdate.getCodeGare()))
                    .findFirst()
                    .ifPresent(gare -> gares.remove(gare));
            this.gares.add(gareAUpdate);

            return false;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la mise à jour de la gare.");
        }
        return false;
    }

    public boolean deleteGare(String codeGare) {
        try {
            gares.stream()
                    .filter(gare -> gare.getCodeGare().equals(codeGare))
                    .findFirst()
                    .ifPresent(gare -> gares.remove(gare));

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la suppression de la gare.");

        }

        return false;
    }

    public Gare getGareByCode(String codeGare) {

        try {
            return gares.stream()
                    .filter(gare -> gare.getCodeGare().equals(codeGare))
                    .findFirst()
                    .orElse(null);

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la recherche de la gare.");
        }

        return null;
    }

    public List<Gare> getAllGares() {
        return gares;
    }
}
