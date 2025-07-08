package planification;

import java.text.DateFormat;

import planification.events.Event;

public interface IAlarme {

    public DateFormat getDate();

    public void setDate(DateFormat date);

    public DateFormat getHeure();

    public void setHeure(DateFormat heure);

    public Event getEvent();

    public void setEvent(Event tache);

    public Status getStatus();

    public void toggleStatus();

    public void ring();

    public void eventRemove();

}
