package com.ihsan.org;

import java.util.HashMap;

public class Location {
    private int id;
    private String description;
    public HashMap<String, Integer> exit = new HashMap<>();

    public Location(int id, String description) {
        this.id = id;
        this.description = description;
    }

    public void addExit(String direction, int location) {
        exit.put(direction, location);
    }

    public int getExit(String direction) {
        if (exit.containsKey(description)) {
            return exit.get(direction);
        }
        return 0;
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
