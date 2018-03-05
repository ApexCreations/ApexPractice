package me.venal.praxi.player;

import me.venal.praxi.Praxi;
import me.venal.praxi.enums.Status;

import java.util.UUID;

public class User implements IUser {
    
    private final Praxi instance;
    private Status status;
    
    private UUID uuid;
    
     // Can be package private
     User(UUID uuid, Praxi instance) {
        this.instance = instance;
        
        this.uuid = uuid;
    }
    
    
    @Override
    public UUID getUniqueID() {
        return this.uuid;
    }
    
    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public Status getStatus() {
        return status;
    }

}
