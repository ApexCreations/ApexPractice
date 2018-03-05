package me.venal.praxi.enums;

public enum Status {

    SPECTATING("Spectating"),
    FIGHTING("Fighting");
    
    private String name;

     Status(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
}
