package garage;

public class Garage {
    private String numeroSiret;
    private String nom;
    public static String adresse;
    private float chiffreAffaires;
    private Voiture[] voitures;
    private int nombreSalariés;
    
    public Garage() {
    }

    public Garage(String numeroSiret, String nom, String adresse, float chiffreAffaires, Voiture[] voitures, int nombreSalariés) {
        this.numeroSiret = numeroSiret;
        this.nom = nom;
        Garage.adresse = adresse;
        this.chiffreAffaires = chiffreAffaires;
        this.voitures = voitures;
        this.nombreSalariés = nombreSalariés;
    }

    public String getNumeroSiret() {
        return numeroSiret;
    }
    public void setNumeroSiret(String numeroSiret) {
        this.numeroSiret = numeroSiret;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public static String getAdresse() {
        return adresse;
    }
    public static void setAdresse(String adresse) {
        Garage.adresse = adresse;
    }
    public float getChiffreAffaires() {
        return chiffreAffaires;
    }
    public void setChiffreAffaires(float chiffreAffaires) {
        this.chiffreAffaires = chiffreAffaires;
    }
    public Voiture[] getVoitures() {
        return voitures;
    }
    public void setVoitures(Voiture[] voitures) {
        this.voitures = voitures;
    }
    public void addVoiture(Voiture voiture) {
        if (voitures == null) {
            voitures = new Voiture[1];
            voitures[0] = voiture;
        } else {
            Voiture[] newVoitures = new Voiture[voitures.length + 1];
            System.arraycopy(voitures, 0, newVoitures, 0, voitures.length);
            newVoitures[voitures.length] = voiture;
            voitures = newVoitures;
        }
    }
    public int getNombreSalariés() {
        return nombreSalariés;
    }
    public void setNombreSalariés(int nombreSalariés) {
        this.nombreSalariés = nombreSalariés;
    }

    

}
