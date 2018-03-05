package me.venal.praxi.player;

import me.venal.praxi.enums.Status;

import java.util.UUID;

public interface IUser {
        
     /*
      * Gets a player's UUID
      * 
      * @return UUID
      */
     
     UUID getUniqueID();
     
     /*
      * Get a user's status
      * 
      * @return Status
      */
       
      Status getStatus();
      
      /*
       * @param Status
       * 
       * Sets a user's status
       */
       
       void setStatus(Status status);
    
       
      
}
