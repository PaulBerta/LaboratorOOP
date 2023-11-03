package Proiect1;

import java.util.ArrayList;
import java.util.List;

//Helper class that manages the movies
public class MovieManager {
    private static List<Movie> movies = new ArrayList<>();

    //Method that returns all movies with a rating higher than 7.0
    public static List<Movie> GetMostAppreciatedMoveies(){
        List<Movie> appreciatedMovies = new ArrayList<Movie>();

        for (Movie movie : movies) {
            if(movie.getRating() > 7.0)
                appreciatedMovies.add(movie);
        }

        return appreciatedMovies;
    }

    //adds a movie to the movies list in the manager
    public static void AddMovieToManager(Movie movie){
        movies.add(movie);
    }
}
