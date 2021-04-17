import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger;
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.S");

    private Logger() { }

    public static void setLogger(Logger logger) {
        Logger.logger = logger;
    }

    public void log(String msg) {
        System.out.println("["+dateFormat.format(new Date())+"] " + msg);
    }

    public static Logger getInstance() {
        if(logger == null) {
            logger = new Logger();
        }
        return logger;
    }
}
