package Proiect1;

import java.util.ArrayList;
import java.util.List;

public class MovieManager {
    public static List<Movie> movies = new ArrayList<>();

    public static List<Movie> GetMostAppreciatedMoveies(){
        List<Movie> appreciatedMovies = new ArrayList<Movie>();

        for (Movie movie : movies) {
            if(movie.rating > 7.0)
                appreciatedMovies.add(movie);
        }
        return appreciatedMovies;
    }
}
