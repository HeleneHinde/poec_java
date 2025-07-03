package planification;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Alarme {

    private DateFormat date = new SimpleDateFormat("yyyy-MM-dd");
    private DateFormat heure = new SimpleDateFormat("HH:mm");
    private Status status;
    private Couleur couleur;
    private Tache tache;

    public Alarme() {
    }

    public DateFormat getDate() {
        return date;
    }

    public void setDate(DateFormat date) {
        this.date = date;
    }

    public DateFormat getHeure() {
        return heure;
    }

    public void setHeure(DateFormat heure) {
        this.heure = heure;
    }

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

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public void toggleStatus() {
        if (this.status == Status.ACTIVE) {
            this.status = Status.INACTIVE;
        } else {
            this.status = Status.ACTIVE;
        }
    }

    public void ring() {
        if (this.status == Status.ACTIVE) {
            System.out.println(this.tache.getTitle() + " à faire !" );
            
            for (String step : this.tache.getSteps()) {
                System.out.println("Étape: " + step);
            }
            this.tache.setStatus(StatusTache.DONE);
        }
    }

    public void tacheRemove() {
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