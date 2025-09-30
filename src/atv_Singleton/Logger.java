package atv_Singleton;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

class Logger {

    private static Logger instancia;
    private PrintWriter writer;

    private Logger() {
        try {
            writer = new PrintWriter(new FileWriter("logfile.txt", true));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static synchronized 
    Logger getInstancia() {
        if (instancia == null) {
            instancia = new Logger(); 
    }
		return instancia;
    }

    public synchronized void writeLog(String msg) {
        writer.println("Log: " + msg);
        writer.flush();
    }

    public synchronized void close() {
        writer.close();
    }
}



