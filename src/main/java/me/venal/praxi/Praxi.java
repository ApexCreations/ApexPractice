package me.venal.praxi;

import com.google.inject.Inject;
import com.google.inject.Injector;
import me.venal.praxi.player.UserHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Praxi extends JavaPlugin {
    
    private Injector injector;
    
    private PraxiModule praxiModule;
    
    @Override
    public void onEnable() {
        praxiModule = new PraxiModule(this);
        injector = praxiModule.createInjector();
        injector.injectMembers(this);
    }

    @Override
    public void onDisable() {
    }
    
    public Injector getInjector() {
        return  injector;
    }
    
    public PraxiModule getModule() {
        return praxiModule;
    }
}
