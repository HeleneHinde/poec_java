package train.bo;

import java.io.Serializable;
import java.time.Instant;

import train.bo.train.ITrain;

public class Voyage implements Serializable {

    private static final long serialVersionUID = 1L;
    private String numero;
    private Instant momentDepart;
    private Instant momentArrivee;
    private Gare gareDepart;
    private Gare gareArrivee;
    private int retardMinutes;
    private ITrain train;
    private Statut etat;

    public Voyage() {
    }

    public Voyage(Instant momentDepart, Instant momentArrivee, Gare gareDepart, Gare gareArrivee, int retardMinutes,
            ITrain train, Statut etat) {
        this.momentDepart = momentDepart;
        this.momentArrivee = momentArrivee;
        this.gareDepart = gareDepart;
        this.gareArrivee = gareArrivee;
        this.retardMinutes = retardMinutes;
        this.train = train;
        this.etat = etat;
    }

    public Instant getMomentDepart() {
        return momentDepart;
    }

    public void setMomentDepart(Instant momentDepart) {
        this.momentDepart = momentDepart;
    }

    public Instant getMomentArrivee() {
        return momentArrivee;
    }

    public void setMomentArrivee(Instant momentArrivee) {
        this.momentArrivee = momentArrivee;
    }

    public Gare getGareDepart() {
        return gareDepart;
    }

    public void setGareDepart(Gare gareDepart) {
        this.gareDepart = gareDepart;
    }

    public Gare getGareArrivee() {
        return gareArrivee;
    }

    public void setGareArrivee(Gare gareArrivee) {
        this.gareArrivee = gareArrivee;
    }

    public int getRetardMinutes() {
        return retardMinutes;
    }

    public void setRetardMinutes(int retardMinutes) {
        this.retardMinutes = retardMinutes;
    }

    public ITrain getTrain() {
        return train;
    }

    public void setTrain(ITrain train) {
        this.train = train;
    }

    public Statut getEtat() {
        return etat;
    }

    public void setEtat(Statut etat) {
        this.etat = etat;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRetard() {
        if (retardMinutes > 0) {
            return "";

        }
        return "";
    }
}
