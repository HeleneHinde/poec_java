package collection;

import java.io.Serializable;

public class Fruit implements Serializable{

    private static final long serialVersionUID = 1L;
    protected String couleur;
    protected String nom;
    protected float poidsGramme;

    public Fruit() {
    }

    public Fruit(String couleur, String nom, float poidsGramme) {
        this.couleur = couleur;
        this.nom = nom;
        this.poidsGramme = poidsGramme;
    }

    public String getCouleur() {
        return couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public float getPoidsGramme() {
        return poidsGramme;
    }
    public void setPoidsGramme(float poidsGramme) {
        this.poidsGramme = poidsGramme;
    } 

    @Override
    public String toString() {
        return "Nom: " + this.getNom() + ", Couleur: " + this.getCouleur() + ", Poids: " + this.getPoidsGramme() + "g";
    }
}