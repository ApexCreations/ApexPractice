package me.venal.praxi.player;

import java.util.UUID;

public interface IUser {
    
     UUID getUniqueID();
     
     boolean isFighting();
     
     boolean isSpectating();
}
