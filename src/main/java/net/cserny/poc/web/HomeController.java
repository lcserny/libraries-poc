package net.cserny.poc.web;

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
        return "Hello Dagger2!";
    }
}
