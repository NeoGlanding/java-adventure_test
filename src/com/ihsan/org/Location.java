package com.ihsan.org;

import java.util.HashMap;

public class Location {
    private int id;
    private String description;
    private HashMap<String, Integer> exit = new HashMap<>();

    public Location(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public void addExit(String direction, int location) {
        exit.put(direction, location);
    }


    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
