package net.cserny.poc.web;

import com.google.gson.Gson;
import com.uwetrottmann.tmdb2.entities.CollectionResultsPage;
import com.uwetrottmann.tmdb2.entities.Movie;
import com.uwetrottmann.tmdb2.entities.MovieResultsPage;
import com.uwetrottmann.tmdb2.entities.TvShow;
import retrofit2.Call;
import spark.Request;
import spark.Response;
import spark.Route;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class HomeController implements Route {

    @Inject
    public HomeController() { }

    @Override
    public Object handle(Request request, Response response) throws Exception {
        response.type("application/json");

//        Call<Movie> movieCall = TmdbService.getMoviesService().summary(550);
//        Movie movie = movieCall.execute().body(); // this does request

//        Call<TvShow> tvShowCall = TmdbService.getTvService().tv(69478);
//        TvShow tvShow = tvShowCall.execute().body();

        Call<MovieResultsPage> movieResultsCall = TmdbService.getSearchService()
                .movie("Fight Club", 1, null, false,
                        1999, null, null);
        MovieResultsPage movies = movieResultsCall.execute().body();
        if (movies != null) {
            return movies.results;
        }

        return "Nothing found...";
    }
}
