package train.dao;

public class VoyageDAOSingleton {
    
    private static VoyageDAO instance;

    private VoyageDAOSingleton() {
        // Private constructor to prevent instantiation
    }

    public static VoyageDAO getInstance() {
        if (instance == null) {
            synchronized (VoyageDAOSingleton.class) {
                if (instance == null) {
                    instance = new VoyageDAO();
                }
            }
        }
        return instance;
    }
}
