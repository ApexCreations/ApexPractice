package me.venal.praxi.listeners;

import me.venal.praxi.Praxi;
import me.venal.praxi.player.IUser;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.util.Optional;

public class JoinListener implements Listener {
    
    private Praxi instance;

    public JoinListener(Praxi instance) {
        this.instance = instance;
        
        instance.getServer().getPluginManager().registerEvents(this, instance);
    }
    
    @EventHandler
    public void onJoin(PlayerJoinEvent event) {
       instance.getUserHandler().add(event.getPlayer().getUniqueId());
    }
    
}
