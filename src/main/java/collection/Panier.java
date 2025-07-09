package collection;

import java.util.ArrayList;
import java.util.List;

public class Panier {

    private static final List<Fruit> fruits = new ArrayList<>();

    public static void main(String[] args) {

        Panier panier = new Panier();

        // Création d'une poire
        Poire poire = new Poire("Jaune", "Poire Williams", 150.0f);

        // Création d'une pomme
        Pomme pomme = new Pomme("Rouge", "Pomme Gala", 120.0f);

        panier.ajouterFruit(poire);
        panier.ajouterFruit(pomme);

        for (Fruit fruit : Panier.fruits) {
            System.out.println(fruit.toString());
        }
    }

    public void ajouterFruit(Fruit fruit) {
        Panier.fruits.add(fruit);
    }
    public void retirerFruit(Fruit fruit) {
        Panier.fruits.remove(fruit);   
    }
    
    
}
