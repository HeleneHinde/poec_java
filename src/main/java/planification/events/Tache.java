package planification.events;

public class Tache extends Event {

    private String[] steps;
    private StatusTache status;
    private final static int STEPSLENGTH = 10;

    public Tache() {
    }

    public String[] getSteps() {
        return steps;
    }

    public void setSteps(String[] steps) {
        if (steps.length > STEPSLENGTH) {
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

    public void toggleStatus() {
        if (this.status == StatusTache.DONE) {
            this.status = StatusTache.TODO;
        } else {
            this.status = StatusTache.DONE;
        }
    }

}