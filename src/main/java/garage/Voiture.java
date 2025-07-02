package garage;

public class Voiture {
    private String marque;

    public Voiture() {
    }

    public String getMarque() {
        return this.marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    void rouler() {
        System.out.println("La voiture de marque " + this.getMarque() + " roule.");
    }
}
