package me.venal.praxi.player;

import com.google.common.collect.Maps;
import me.venal.praxi.Praxi;

import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class UserHandler {
    
    private final Praxi instance;
    
    private Map<UUID, IUser> users;
    
    public UserHandler(Praxi instance) {
        this.instance = instance;
        
        users = Maps.newConcurrentMap();
    }
    
    public Optional<IUser> getUser(UUID uuid) {
        if (!has(uuid)) return Optional.empty();
        return Optional.of(getUsers().get(uuid));
    }
    
    public void add(UUID uuid) {
        if (!(has(uuid))) {
            IUser user = new User(uuid, instance);
            users.put(uuid, user);
        }
    }
    
    public void remove(UUID uuid) {
        if (has(uuid)) {
            users.remove(uuid);
        }
    }
    
    private boolean has(UUID uuid) {
        return users.containsKey(uuid);
    }

    public Map<UUID, IUser> getUsers() {
        return users;
    }
}
