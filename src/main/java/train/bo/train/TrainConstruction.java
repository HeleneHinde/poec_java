package train.bo.train;

public class TrainConstruction extends Train {

    private static final long serialVersionUID = 3L;
    private float capaciteTonnes;

    public TrainConstruction() {
        super();
    }

    public TrainConstruction(String numero, TypeTrain typeTrain, float capaciteTonnes) {
        super(numero, typeTrain);
        this.capaciteTonnes = capaciteTonnes;
    }

    public float getCapaciteTonnes() {
        return capaciteTonnes;
    }

    public void setCapaciteTonnes(float capaciteTonnes) {
        this.capaciteTonnes = capaciteTonnes;
    }

    @Override
    public String getDescription() {
        return "Train Voyageur " + getNumero() + " de type " + getTypeTrain().name() + " de " + capaciteTonnes
                + " tonnes.";
    }

}
