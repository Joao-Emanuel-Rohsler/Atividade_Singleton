package atv_Singleton;

public class Main {
    public static void main(String[] args) {
    	DBConn db1 = DBConn.getInstance();
        DBConn db2 = DBConn.getInstance();

        db1.conecta();

       System.out.println(db1 == db2);
    }
}