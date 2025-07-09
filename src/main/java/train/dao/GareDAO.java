package train.dao;

import java.util.ArrayList;
import java.util.List;

import train.bo.Gare;

public class GareDAO {

    private List<Gare> gares = new ArrayList<>();


    public boolean createGare(Gare gare) {
        try {
            this.gares.add(gare);
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }
    }

    public boolean updateGare(Gare gare) {
        try {

            if (gares.contains(gare)) {
                int index = gares.indexOf(gare);
                gares.set(index, gare); 
                return true; 
            } 

            return false; 

        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }
    }

    public boolean deleteGare(String codeGare) {
        try {
            this.gares.remove(codeGare);
            return true; 
        } catch (Exception e) {
            e.printStackTrace();
            return false; 
        }
    }

    public Gare getGareByCode(String codeGare) {
        return gares.stream()
            .filter(gare -> gare.getCodeGare().equals(codeGare))
            .findFirst()
            .orElse(null); 
    }

    public List<Gare> getAllGares() {
        return gares;
    }
}
