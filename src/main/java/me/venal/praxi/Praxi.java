package me.venal.praxi;

import com.google.inject.Injector;
import me.venal.praxi.player.UserHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Praxi extends JavaPlugin {
    
    private Injector injector;
    private UserHandler userHandler;
    private PraxiModule praxiModule;
    
    @Override
    public void onEnable() {
        userHandler = new UserHandler(this);
        praxiModule = new PraxiModule(this);
        
        injector = praxiModule.createInjector();
        injector.injectMembers(this);
    }

    @Override
    public void onDisable() {
    }

    public UserHandler getUserHandler() {
        return userHandler;
    }
}
