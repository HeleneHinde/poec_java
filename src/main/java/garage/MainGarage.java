package garage;

public class MainGarage {
    public static void main(String[] args) {
        Garage garage = new Garage();
        


        Voiture voiture1 = new Voiture();
        voiture1.setMarque("Toyota");
        voiture1.rouler();
        Voiture voiture2 = new Voiture();
        voiture2.setMarque("Honda");
        voiture2.rouler(); 

        garage.addVoiture(voiture1);
        garage.addVoiture(voiture2);

        System.out.println("Le garage possède " + garage.getVoitures().length + " voitures.");

    }
}
