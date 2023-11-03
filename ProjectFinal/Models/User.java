package Models;
public class User {
    private int userID;
    private String username;
    private String password;
    private double age;
    private double weight;

    public User(int userID, String username, String password, double age, double weight) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.age = age;
        this.weight = weight;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public int getUserID() {
        return userID;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return userID + " " + username + " " + password + " " + age + " " + weight;
    }
}
