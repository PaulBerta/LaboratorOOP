package Lab6;

public class Manager {
    
    private CititorTastatura cititor;
    private String cool_message;

    public Manager(String message){
        this.cool_message = message;
    }

    public String afiseazaMesaj(){
        return this.cool_message;
    }

    public String citesteMesaj(){
        return this.cool_message;
    }
}
