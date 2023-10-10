package Proiect1;

import java.util.Scanner;

public class MovieApplication {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int optiuneMeniu = 3;

        while(optiuneMeniu!=0){
            
            System.out.println("1. Add test data and display it.");
            System.out.println("2. Add a movie.");
            System.out.println("3. Get a list of the best rated movies.");
            System.out.println("0. Quit the application.");
            optiuneMeniu = scanner.nextInt();
            scanner.nextLine();
            
            switch(optiuneMeniu){
                case 0:
                    break;
                case 1:
                {
                    Movie m1 = new Movie("Avatar", 8.2);
                    Movie m2 = new Movie("Lord Of The Rings", 9.5);
                    Movie m3 = new Movie("Fast and Furious 10", 6.1);

                    MovieManager.movies.add(m1);
                    MovieManager.movies.add(m2);
                    MovieManager.movies.add(m3);

                    for (Movie apreciatMovie : MovieManager.GetMostAppreciatedMoveies()) {
                        System.out.println(apreciatMovie.toString());
                    }
                    break;
                }
                case 2:
                {
                    String numeFilmNou = scanner.nextLine();
                    Double ratingFilmNou = scanner.nextDouble();
                    Movie newMovie = new Movie(numeFilmNou, ratingFilmNou);
                    
                    MovieManager.movies.add(newMovie);

                    break;
                }
                case 3:
                {
                    for (Movie apreciatMovie : MovieManager.GetMostAppreciatedMoveies()) {
                        System.out.println(apreciatMovie.toString());
                    }
                    break;
                }
            }
        }

        scanner.close();
    }
}
