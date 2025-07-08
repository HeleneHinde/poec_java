package planification;

import java.text.DateFormat;

import planification.events.Tache;

public interface IAlarme {

    public DateFormat getDate();

    public void setDate(DateFormat date);

    public DateFormat getHeure();

    public void setHeure(DateFormat heure);

    public Tache getTache();

    public void setTache(Tache tache);

    public Status getStatus();

    public void toggleStatus();

    public void ring();

    public void eventRemove();

}
