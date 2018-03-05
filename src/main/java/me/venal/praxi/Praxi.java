package me.venal.praxi;

import me.venal.praxi.player.UserHandler;
import org.bukkit.plugin.java.JavaPlugin;

public class Praxi extends JavaPlugin {
    
    private UserHandler userHandler;
    
    @Override
    public void onEnable() {
        userHandler = new UserHandler(this);
    }

    @Override
    public void onDisable() {
    }

    public UserHandler getUserHandler() {
        return userHandler;
    }
}
