package me.venal.praxi;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import me.venal.praxi.player.UserHandler;

public class PraxiModule extends AbstractModule {

    private final Praxi praxi;

    public PraxiModule(Praxi praxi) {
        this.praxi = praxi;
    }

    @Override
    protected void configure() {
        this.bind(Praxi.class).toInstance(praxi);
        this.bind(UserHandler.class).toInstance(new UserHandler(praxi));
    }

     public Injector createInjector() {
        return Guice.createInjector(this);
    }
}
