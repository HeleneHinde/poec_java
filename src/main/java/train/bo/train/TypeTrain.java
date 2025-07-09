package train.bo.train;

public enum TypeTrain {
    TER("TER"),
    TGV("TGV"),
    INTERCITE("Intercité");

    private final String icone;

    private TypeTrain(String icone) {
        this.icone = icone;
    }

}