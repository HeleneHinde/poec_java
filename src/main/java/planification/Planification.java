package planification;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Planification {

    private Tache[] taches;
    private Alarme[] alarmes;
    private final static int TACHESLENGTH = 20;
    private final static int ALARMELENGTH = 5;

    public Planification() {
    }

    public Tache[] getTaches() {
        return taches;
    }

    public Alarme[] getAlarmes() {
        return alarmes;
    }

    public Tache createTache(String title, String[] steps) {
        if (taches == null) {
            taches = new Tache[TACHESLENGTH];
        }
        for (int i = 0; i < TACHESLENGTH; i++) {
            if (taches[i] == null) {
                Tache tache = new Tache();
                tache.setTitle(title);
                tache.setSteps(steps);
                tache.setStatus(StatusTache.TODO);
                taches[i] = tache;
                return tache;
            }
        }
        throw new IllegalStateException("Le nombre maximum de tâches a été atteint.");
    }

    public Alarme createAlarme(DateFormat date, DateFormat heure, Status status, Couleur couleur) {
        if (this.alarmes == null) {
            this.alarmes = new Alarme[ALARMELENGTH];
        }
        for (int i = 0; i < ALARMELENGTH; i++) {
            if (alarmes[i] == null) {
                Alarme alarme = new Alarme();
                alarme.setDate(date);
                alarme.setHeure(heure);
                alarme.setStatut(status);
                alarme.setCouleur(couleur);
                alarmes[i] = alarme;
                return alarme;
            }
        }
        throw new IllegalStateException("Le nombre maximum d'alarmes a été atteint.");
    }

    public void associateAlarmeToTache(Alarme alarme, Tache tache) {
        if (alarme == null || tache == null) {
            throw new IllegalArgumentException("L'alarme et la tâche doivent être non nulles.");
        }
        alarme.setTache(tache);
        tache.setAlarme(alarme);
    }

    public void dissociateAlarmeFromTache(Alarme alarme, Tache tache) {
        if (alarme == null || tache == null) {
            throw new IllegalArgumentException("L'alarme et la tâche doivent être non nulles.");
        }
        alarme.tacheRemove();
        tache.removeAlarme();
    }

    public void ringTache(Tache tache) {
        if (tache == null || tache.getAlarme() == null) {
            throw new IllegalArgumentException("La tâche et son alarme doivent être non nulles.");
        }
        tache.getAlarme().ring();
    }

    public void simulatorOfTime() {

        DateFormat[] dates = { new SimpleDateFormat("2023-09-31"), new SimpleDateFormat("2023-10-01"),
                new SimpleDateFormat("2023-10-02") };
        DateFormat[] heures = { new SimpleDateFormat("11:00"), new SimpleDateFormat("12:00"),
                new SimpleDateFormat("13:00") };

        // Simulateur de temps pour les alarmes
        for (DateFormat date : dates) {
            for (DateFormat heure : heures) {
                for (Alarme alarme : alarmes) {
                    if (null != alarme && alarme.getDate().equals(date) && alarme.getHeure().equals(heure)) {
                        alarme.ring();
                    } else {
                        System.out.println("Aucune alarme à sonner pour la date " + date.format(new Date())
                                + " et l'heure " + heure.format(new Date()));
                    }
                }
            }
        }
    }

}
