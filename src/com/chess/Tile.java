package com.chess;

public class Tile {
    private final Location location;
    private final String name;

    public Tile(Location tileLocation,String tileName)
    {
        location= tileLocation;
        name= tileName;
    }

    public Location getLocation()
    {
        return location;
    }

    public String getName(){
        return name;
    }
}
