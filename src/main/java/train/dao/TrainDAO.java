package train.dao;

import java.util.ArrayList;
import java.util.List;

import train.bo.train.Train;

public class TrainDAO {

    private List<Train> trains = new ArrayList<>();

    private static TrainDAO instance;

    TrainDAO() {
    }

    public synchronized static TrainDAO getInstance() {
        if (instance == null) {
            instance = new TrainDAO();
        }
        return instance;
    }

    public boolean createTrain(Train train) {
        try {
            this.trains.add(train);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de l'ajout du train.");

        }
        return false;
    }

    public boolean updateTrain(Train train) {
        try {

            if (trains.contains(train)) {
                int index = trains.indexOf(train);
                trains.set(index, train);
                return true;
            }

            return false;

        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la mise à jour du train.");

        }
        return false;
    }

    public boolean deleteTrain(String trainNumber) {
        try {
            this.trains.stream()
                    .filter(train -> train.getNumero().equals(trainNumber))
                    .findFirst()
                    .ifPresent(train -> trains.remove(train));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la suppression du train.");

        }
        return false;
    }

    public List<Train> getAllTrains() {
        return trains;
    }

    public Train getTrainByNumber(String trainNumber) {
        try {
            return trains.stream().filter(train -> train.getNumero().equals(trainNumber))
                    .findFirst().orElse(null);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de la selection du train.");

        }
        return null;

    }

}
