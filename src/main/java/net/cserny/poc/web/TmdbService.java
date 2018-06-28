package net.cserny.poc.web;

import com.uwetrottmann.tmdb2.Tmdb;
import com.uwetrottmann.tmdb2.services.MoviesService;
import com.uwetrottmann.tmdb2.services.SearchService;
import com.uwetrottmann.tmdb2.services.TvService;

public class TmdbService {

    private static Tmdb tmdb;
    private static MoviesService moviesService;
    private static TvService tvService;
    private static SearchService searchService;

    private TmdbService() { }

    private static Tmdb getTmdb() {
        if (tmdb == null) {
            tmdb = new Tmdb("c37791bac5bebdfeb3e73db3632b9a13");
        }
        return tmdb;
    }

    public static MoviesService getMoviesService() {
        if (moviesService == null) {
            moviesService = getTmdb().moviesService();
        }
        return moviesService;
    }

    public static TvService getTvService() {
        if (tvService == null) {
            tvService = getTmdb().tvService();
        }
        return tvService;
    }

    public static SearchService getSearchService() {
        if (searchService == null) {
            searchService = getTmdb().searchService();
        }
        return searchService;
    }
}
