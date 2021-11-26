package algorithmsfilter.movie;

import java.util.ArrayList;
import java.util.List;

public class VideoTheque {
    private List<Movie> movieList = new ArrayList<>();

    public void addMovie(Movie movie){
        movieList.add(movie);
    }

    public List<Movie> getGoodMoviesWithCategoryGiven(Category category){
        List<Movie> filteredMovieList = new ArrayList<>();
        for(Movie m: movieList){
            if(m.getRating() > 3 && m.getCategory() == category){
                filteredMovieList.add(m);
            }
        }
        return filteredMovieList;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }
}
