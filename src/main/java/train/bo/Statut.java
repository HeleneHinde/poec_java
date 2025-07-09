package train.bo;

public enum Statut {

    PROGRAMME("Programme"),
    ANNULE("Annulé"),
    RETARD("Retard"),
    EN_ROUTE("En route"),
    ARRIVE("Arrivé");

    private final String description;

    private Statut(String description) {
        this.description = description;
    }

}
