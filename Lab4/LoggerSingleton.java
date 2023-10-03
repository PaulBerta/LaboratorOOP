package Lab4;

public class LoggerSingleton {
    
    private static LoggerSingleton _instance;

    private LoggerSingleton(){

    }

    public static LoggerSingleton getInstance(){
        if(_instance == null){
            _instance = new LoggerSingleton();
        }

        return _instance;
    }

    public void log(String message){
        System.out.println("[LOG]: " + message);
    }
}
