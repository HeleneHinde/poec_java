package train.bo.train;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import train.bo.Voyage;

public abstract class Train implements ITrain, Serializable {

    private static final long serialVersionUID = 5L;
    private String numero;
    private TypeTrain typeTrain;
    private List<Voyage> voyages = new ArrayList<>();

    public Train() {
    }

    public Train(String numero, TypeTrain typeTrain) {
        this.numero = numero;
        this.typeTrain = typeTrain;
    }

    @Override
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

    @Override
    public List<Voyage> getVoyages() {
        return voyages;
    }

    public void setVoyages(List<Voyage> voyages) {
        this.voyages = voyages;
    }
}