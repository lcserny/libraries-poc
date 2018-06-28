package net.cserny.poc.web;

import static spark.Spark.get;

public class Application {

    private final HomeController homeController;

    public Application() {
        ProdComponent component = DaggerProdComponent.create();
        homeController = component.homeController();
    }

    private void run() {
        get("/", homeController);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.run();
    }
}
