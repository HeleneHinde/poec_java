package planification;

public class Tache {

    private String title;
    private String[] steps;
    private StatusTache status;
    private Alarme alarme;
    final private int stepsLength = 10;

    public Tache() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        if (steps.length > stepsLength) {
            throw new IllegalArgumentException("Le nombre d'étapes ne peut pas dépasser 10.");
        } else {
            this.steps = steps;
        }
    }

    public StatusTache getStatus() {
        return status;
    }

    public void setStatus(StatusTache status) {
        this.status = status;
    }

    public Alarme getAlarme() {
        return alarme;
    }

    public void setAlarme(Alarme alarme) {
        this.alarme = alarme;
    }

    public void removeAlarme() {
        if (this.alarme != null) {
            this.alarme = null;
            System.out.println("Alarme associée à la tâche supprimée.");
        } else {
            System.out.println("Aucune alarme associée à cette tâche.");
        }
    }

    public void toggleStatus() {
        if (this.status == StatusTache.DONE) {
            this.status = StatusTache.TODO;
        } else {
            this.status = StatusTache.DONE;
        }
    }

}

enum StatusTache {
    DONE,
    TODO,
}