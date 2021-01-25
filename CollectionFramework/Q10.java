package CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Q10 {
    public static void main(String[] args) {
        MovieDetails m1 = new MovieDetails("Shrek","Shrek", "Fiona","Fantasy");
        MovieDetails m2 = new MovieDetails("Cars","Lightning", "Shelly","Cars");
        MovieDetails m3 = new MovieDetails("LOTR","Frodo", "Arwen","Action");
        MovieDetails m4 = new MovieDetails("Spirited Away","Boy", "Girl","Animated");
        MoviesList movies = new MoviesList();
        movies.addMovie(m1);
        movies.addMovie(m2);
        movies.addMovie(m3);
        movies.addMovie(m4);
        System.out.println(movies);
        System.out.println("----");
        movies.sortBy("genre");
        System.out.println("----");
        movies.sortBy("actor");
        System.out.println("----");
        movies.sortBy("actress");
        System.out.println("----");
        movies.sortBy("name");
    }
}

class MovieDetails {
    private String movieName, leadActor, leadActress, genre;

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getLeadActor() {
        return leadActor;
    }

    public void setLeadActor(String leadActor) {
        this.leadActor = leadActor;
    }

    public String getLeadActress() {
        return leadActress;
    }

    public void setLeadActress(String leadActress) {
        this.leadActress = leadActress;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public MovieDetails(String movieName, String leadActor, String leadActress, String genre) {
        this.movieName = movieName;
        this.leadActor = leadActor;
        this.leadActress = leadActress;
        this.genre = genre;
    }

    public String toString(){
        return this.movieName + " " + this.leadActor + " " + this.leadActress + " " +  this.genre;
    }
}

class MoviesList {
    ArrayList<MovieDetails> movies;

    public MoviesList() {
        movies = new ArrayList<>();
    }

    public void addMovie(MovieDetails movie) {
        movies.add(movie);
    }

    public void removeMovie(MovieDetails movie) {
        movies.remove(movie);
    }

    public void removeAllMovies() {
        movies.clear();
    }

    public MovieDetails findByMovieName(String name) {
        Iterator<MovieDetails> movieIterator = this.movies.iterator();
        while (movieIterator.hasNext()) {
            MovieDetails movie = (MovieDetails) movieIterator.next();
            if (movie.getMovieName().equals(name)) {
                return movie;
            }
        }
        return null;
    }

    public MovieDetails findByMovieGenre(String genre) {
        Iterator<MovieDetails> movieIterator = this.movies.iterator();
        while (movieIterator.hasNext()) {
            MovieDetails movie = (MovieDetails) movieIterator.next();
            if (movie.getGenre().equals(genre)) {
                return movie;
            }
        }
        return null;
    }

    public void sortBy(String option){
        if(option.equals("genre")){
            SortMovieGenre sortGenre = new SortMovieGenre();
            Collections.sort(this.movies, sortGenre);
            System.out.println(this.movies);
        } else if(option.equals("actress")){
            SortMovieActress sortActress = new SortMovieActress();
            Collections.sort(this.movies, sortActress);
            System.out.println(this.movies);
        } else if(option.equals("actor")){
            SortMovieActor sortActor = new SortMovieActor();
            Collections.sort(this.movies, sortActor);
            System.out.println(this.movies);
        } else if(option.equals("name")){
            SortMovieName sortName = new SortMovieName();
            Collections.sort(this.movies, sortName);
            System.out.println(this.movies);
        } else {
            System.out.println("Select valid option");
        }
    }

    public String toString(){
        String movies= "";
        Iterator movieIterator = this.movies.iterator();
        while(movieIterator.hasNext()){
            movies += movieIterator.next() +"\n";
        }
        return movies;
    }
}

class SortMovieName implements Comparator<MovieDetails> {
    @Override
    public int compare(MovieDetails o1, MovieDetails o2) {
        return o1.getMovieName().compareTo(o2.getMovieName());
    }  
}

class SortMovieGenre implements Comparator<MovieDetails> {
    @Override
    public int compare(MovieDetails o1, MovieDetails o2) {
        return o1.getGenre().compareTo(o2.getGenre());
    }  
}

class SortMovieActor implements Comparator<MovieDetails> {
    @Override
    public int compare(MovieDetails o1, MovieDetails o2) {
        return o1.getLeadActor().compareTo(o2.getLeadActor());
    }  
}

class SortMovieActress implements Comparator<MovieDetails> {
    @Override
    public int compare(MovieDetails o1, MovieDetails o2) {
        return o1.getLeadActress().compareTo(o2.getLeadActress());
    }  
}



