package com.zafranitechllcpc.journey.models;

public class Establishment  extends BaseModel {

    Location location;
    String name;

    public Establishment() {}


    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
