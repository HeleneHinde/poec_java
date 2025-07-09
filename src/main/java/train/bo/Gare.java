package train.bo;

import java.io.Serializable;

public class Gare implements Serializable{

    private static final long serialVersionUID = 2L;
    private String codeGare;
    private String nom;
    private String commune;
    private String pays;

    public Gare() {
    }

    public Gare(String codeGare, String nom, String commune, String pays) {
        this.codeGare = codeGare;
        this.nom = nom;
        this.commune = commune;
        this.pays = pays;
    }

    public String getCodeGare() {
        return codeGare;
    }

    public void setCodeGare(String codeGare) {
        this.codeGare = codeGare;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCommune() {
        return commune;
    }

    public void setCommune(String commune) {
        this.commune = commune;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

}
