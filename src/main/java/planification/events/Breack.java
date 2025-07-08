package planification.events;

public class Breack extends Event {


    private int duration; // in minutes

    public Breack() {
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            throw new IllegalArgumentException("La durée doit être positive.");
        }
        this.duration = duration;
    }
    
}
