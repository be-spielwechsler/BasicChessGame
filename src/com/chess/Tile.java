package com.chess;

public class Tile {
    private final CurrentLocation currentLocation;
    private final String tileName;

    public Tile(CurrentLocation tileLocation, String tileName) {
        currentLocation = tileLocation;
        this.tileName = tileName;
    }

    public CurrentLocation getCurrentLocation() {
        return currentLocation;
    }

    public String getTileName() {
        return tileName;
    }

}
