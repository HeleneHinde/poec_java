package train.bo.train;

import java.io.Serializable;

public class TrainVoyageur extends Train implements Serializable {

    private static final long serialVersionUID = 4L;
    private int nombreSieges;

    public TrainVoyageur() {
        super();
    }

    public TrainVoyageur(String numero, TypeTrain typeTrain, int nombreSieges) {
        super(numero, typeTrain);
        this.nombreSieges = nombreSieges;
    }

    public int getNombreSieges() {
        return nombreSieges;
    }

    public void setNombreSieges(int nombreSieges) {
        this.nombreSieges = nombreSieges;
    }

    @Override
    public String getDescription() {
        return "Train de Construction " + getNumero() + " de type " + getTypeTrain().name() + " avec "
                + nombreSieges + " sièges.";
    }

}
