package collection;

import java.io.Serializable;

public class Fruit implements Serializable{

    protected String couleur;
    protected String nom;
    protected float poidsGramme;

    public Fruit() {
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
}