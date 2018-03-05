package me.venal.praxi.listeners;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import me.venal.praxi.Praxi;
import me.venal.praxi.player.IUser;
import me.venal.praxi.player.UserHandler;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Optional;
public class JoinListener implements Listener {
    
    private @Inject Praxi instance;
    private @Inject UserHandler userHandler;
    
    public JoinListener() {
        instance.getServer().getPluginManager().registerEvents(this, instance);
    }
    
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
       userHandler.add(event.getPlayer().getUniqueId());
    }
    
}
