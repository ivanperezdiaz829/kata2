package software.ulpgc.kata2;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        RemoteMovieLoader remoteMovieLoader = new RemoteMovieLoader();
        List<Movie> movies = remoteMovieLoader.loadMovies();
        for (Movie movie : movies) {
            System.out.println(movie);
        }
    }
}
