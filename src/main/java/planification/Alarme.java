package planification;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import planification.events.Event;
import planification.events.StatusTache;
import planification.events.Tache;

public class Alarme implements IAlarme {

    private DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    private DateFormat heure = new SimpleDateFormat("HH:mm");
    private Status status;
    private Couleur couleur;
    private Event event;

    public Alarme() {
    }

    @Override
    public DateFormat getDate() {
        return date;
    }

    @Override
    public void setDate(DateFormat date) {
        this.date = date;
    }

    @Override
    public DateFormat getHeure() {
        return heure;
    }

    @Override
    public void setHeure(DateFormat heure) {
        this.heure = heure;
    }

    @Override
    public Status getStatus() {
        return status;
    }

    public void setStatut(Status status) {
        this.status = status;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    @Override
    public Event getEvent() {
        return event;
    }

    @Override
    public void setEvent(Event event) {
        this.event = event;
    }

    @Override
    public void toggleStatus() {
        if (this.status == Status.ACTIVE) {
            this.status = Status.INACTIVE;
        } else {
            this.status = Status.ACTIVE;
        }
    }

    @Override
    public void ring() {
        if (this.status == Status.ACTIVE) {
            System.out.println(this.event.getTitle() + " à faire !");

            if (event instanceof Tache tache) {
                for (String step : tache.getSteps()) {
                    System.out.println("Étape: " + step);
                }
                tache.setStatus(StatusTache.DONE);
            }
        }
    }

    @Override
    public void eventRemove() {
        if (this.event != null) {
            this.event = null;
            System.out.println("Tâche associée à l'alarme supprimée.");
        } else {
            System.out.println("Aucune tâche associée à supprimer.");
        }
    }
}

enum Status {
    ACTIVE,
    INACTIVE,
}

enum Couleur {
    rouge("important", 1),
    vert("pense_bête", 4),
    jaune("attention", 2),
    bleu("classique", 3);

    private final String description;
    private final int priority;

    Couleur(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}