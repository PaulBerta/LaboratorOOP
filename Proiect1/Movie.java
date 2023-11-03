package Proiect1;

//
public class Movie {
    private String name;
    private Double rating;

    
    //Contructor
    public Movie(String name, Double rating){
        this.name = name;
        this.rating = rating;
    }
    
    //public getter for the private field rating
    public Double getRating(){
        return this.rating;
    }

    //public setter for the private field rating
    public void setRating(Double newRating){
        this.rating = newRating;
    }

    //toString method to help us print the details of a movie
    public String toString(){
        return this.name + " with the rating: " + this.rating;  
    } 
}
