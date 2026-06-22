package software.ulpgc.kata2;

import java.io.IOException;
import java.util.List;

public interface MovieLoader {
    List<Movie> loadMovies() throws IOException;
}
