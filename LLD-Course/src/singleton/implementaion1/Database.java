package singleton.implementaion1;

public class Database {
    private static Database instance = null;

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            // synchronized {
            // if (instance == null) {
            instance = new Database();
            // }
            // }
        }
        return instance;
    }
}
