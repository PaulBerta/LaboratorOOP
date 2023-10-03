package Lab4;

public class Main {
    public static void main(String[] args) {
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.log("This is a logg message");
    }
}
