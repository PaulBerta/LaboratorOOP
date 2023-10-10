package Proiect1;

public class Movie {
    public String name;
    public Double rating;

    public Movie(String name, Double rating){
        this.name = name;
        this.rating = rating;
    }

    public String toString(){
        return this.name + " with the rating: " + this.rating;  
    } 
}
