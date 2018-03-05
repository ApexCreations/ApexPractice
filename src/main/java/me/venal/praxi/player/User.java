package me.venal.praxi.player;

import me.venal.praxi.Praxi;

import java.util.UUID;

public class User implements IUser {
    
    private final Praxi instance;
    
    private UUID uuid;
    private boolean isFighting, isSpectating;
    
    public User(UUID uuid, Praxi instance) {
        this.instance = instance;
        
        this.uuid = uuid;
        
    }
    
    
    @Override
    public UUID getUniqueID() {
        return this.uuid;
    }

    @Override
    public boolean isFighting() {
        return this.isFighting;
    }

    @Override
    public boolean isSpectating() {
        return this.isSpectating;
    }

    public void setSpectating(boolean spectating) {
        this.isSpectating = spectating;
    }

    public void setFighting(boolean fighting) {
        this.isFighting = fighting;
    }
}
