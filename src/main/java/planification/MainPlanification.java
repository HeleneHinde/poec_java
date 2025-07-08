package planification;

import java.text.SimpleDateFormat;

import planification.events.Tache;

public class MainPlanification {

    public static void main(String[] args) {
        Planification planification = new Planification();

        // Création d'une tâche
        String[] steps = { "Étape 1", "Étape 2", "Étape 3" };
        Tache tache = planification.createTache("Ma Tâche", steps);

        // Création d'une alarme
        IAlarme alarme = planification.createAlarme(new SimpleDateFormat("2023-10-01"), new SimpleDateFormat("12:00"),
                Status.ACTIVE, Couleur.rouge);

        // Association de l'alarme à la tâche
        planification.associateAlarmeToTache(alarme, tache);

        // Simulation du temps pour déclencher l'alarme
        planification.simulatorOfTime();

        alarme.toggleStatus(); // Changement du statut de l'alarme

        System.out.println(alarme.getStatus()); // Affiche le statut de l'alarme

        // Affichage de l'erreur si nombre d'alarme a été atteint
        for (int i = 0; i<5; i++) {
            planification.createAlarme(new SimpleDateFormat("2023-10-01"), new SimpleDateFormat("12:00"),
                Status.ACTIVE, Couleur.rouge);
        }
    }
}
