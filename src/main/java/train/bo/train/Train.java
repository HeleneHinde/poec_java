package train.bo.train;

public abstract class Train implements ITrain {

    private String numero;
    private TypeTrain typeTrain;

    public Train() {
    }

    public Train(String numero, TypeTrain typeTrain) {
        this.numero = numero;
        this.typeTrain = typeTrain;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public TypeTrain getTypeTrain() {
        return typeTrain;
    }

    public void setTypeTrain(TypeTrain typeTrain) {
        this.typeTrain = typeTrain;
    }

}