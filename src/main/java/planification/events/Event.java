package planification.events;

import planification.IAlarme;

public class Event {

    protected String title;
    protected IAlarme alarme;

    public Event() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public IAlarme getAlarme() {
        return alarme;
    }

    public void setAlarme(IAlarme alarme) {
        this.alarme = alarme;
    }

    public void removeAlarme() {
        if (this.alarme != null) {
            this.alarme = null;
            System.out.println("Alarme associée à cet évènement supprimée.");
        } else {
            System.out.println("Aucune alarme associée à cet évènement.");
        }
    }

}
