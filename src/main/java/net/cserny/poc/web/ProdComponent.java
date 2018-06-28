package net.cserny.poc.web;

import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {ControllerModule.class})
public interface ProdComponent {
    HomeController homeController();
}
