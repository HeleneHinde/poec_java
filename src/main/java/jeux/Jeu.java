package jeux;

public class Jeu {
    public static void main(String[] args) {
        Joueur joueur1 = new Joueur();
        joueur1.setIdentifiant("Joueur1");
        joueur1.setPosition(0);

        Joueur joueur2 = new Joueur();
        joueur2.setIdentifiant("Joueur2");
        joueur2.setPosition(0);

        Joueur[] joueurs = {joueur1, joueur2};

        for (Joueur joueur : joueurs) {
            System.out.println("Identifiant: " + joueur.getIdentifiant() + ", Position: " + joueur.getPosition());
        }
    }
}
