import Database.DatabaseManager;
import UI.MainWindow;

public class App {
    public static void main(String[] args) throws Exception {
        
        DatabaseManager.initialize();
        MainWindow mainWindow = new MainWindow();
        mainWindow.setVisible(true);
    }
}
