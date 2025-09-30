package atv_Singleton;

public class DBConn {
    private static DBConn instance;

    private DBConn() {
    }

    public static DBConn getInstance() {
        if (instance == null) {
            instance = new DBConn();
        }
        return instance;
    }

 
    public void conecta() {
        System.out.println("Conecta com o banco de dados!");
    }
}
