package net.cserny.poc.web;

import com.google.gson.Gson;

import static spark.Spark.get;

public class Application {

    private final HomeController homeController;
    private final Gson gson = new Gson();

    public Application() {
        ProdComponent component = DaggerProdComponent.create();
        homeController = component.homeController();
    }

    private void run() {
        get("/", homeController, gson::toJson);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}
