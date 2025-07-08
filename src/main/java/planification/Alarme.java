package planification;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import planification.events.StatusTache;
import planification.events.Tache;

public class Alarme implements IAlarme {

    private DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    private DateFormat heure = new SimpleDateFormat("HH:mm");
    private Status status;
    private Couleur couleur;
    private Tache tache;

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
    public Tache getTache() {
        return tache;
    }

    @Override
    public void setTache(Tache tache) {
        this.tache = tache;
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
            System.out.println(this.tache.getTitle() + " à faire !");

            for (String step : this.tache.getSteps()) {
                System.out.println("Étape: " + step);
            }
            this.tache.setStatus(StatusTache.DONE);
        }
    }

    @Override
    public void eventRemove() {
        if (this.tache != null) {
            this.tache = null;
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
    rouge("important"),
    vert("pense_bête"),
    jaune("attention"),
    bleu("classique");

    private final String description;

    Couleur(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}