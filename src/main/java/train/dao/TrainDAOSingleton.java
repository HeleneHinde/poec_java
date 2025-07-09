package train.dao;

public class TrainDAOSingleton {
    
    private static TrainDAO instance;

    private TrainDAOSingleton() {
        // Private constructor to prevent instantiation
    }

    public static TrainDAO getInstance() {
        if (instance == null) {
            synchronized (TrainDAOSingleton.class) {
                if (instance == null) {
                    instance = new TrainDAO();
                }
            }
        }
        return instance;
    }
}
