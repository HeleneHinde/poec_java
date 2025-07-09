package train.dao;

import java.util.ArrayList;
import java.util.List;

import train.bo.train.Train;

public class TrainDAO {

    private final List<Train> trains = new ArrayList<>();

    private static TrainDAO instance;

    TrainDAO() {
    }

    public synchronized static TrainDAO getInstance() {
        if (instance == null) {
            instance = new TrainDAO();
        }
        return instance;
    }

    public Train createTrain(Train train) {
        try {
            this.trains.add(train);
            return train;
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Une erreur est survenue lors de l'ajout du train.");

        }
        return train;
    }

    public boolean updateTrain(Train trainAUpdate) {
        try {

            this.trains.stream()
                    .filter(train -> train.getNumero().equals(trainAUpdate.getNumero()))
                    .findFirst()
                    .ifPresent(train -> trains.remove(train));
            this.trains.add(trainAUpdate);

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
