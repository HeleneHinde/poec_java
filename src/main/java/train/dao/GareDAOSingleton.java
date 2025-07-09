package train.dao;

public class GareDAOSingleton {

    private static GareDAO instance;

    private GareDAOSingleton() {
        // Private constructor to prevent instantiation
    }

    public static GareDAO getInstance() {
        if (instance == null) {
            synchronized (GareDAOSingleton.class) {
                if (instance == null) {
                    instance = new GareDAO();
                }
            }
        }
        return instance;
    }

}
