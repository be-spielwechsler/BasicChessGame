package com.chess;

public class CurrentLocation {
    private final int xCoordinate;
    private final int yCoordinate;

    public CurrentLocation(int xCoordinate, int yCoordinate) {
       this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getxCoordinate() {
        return xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public String toString() {
        char r = (char) ('A' + xCoordinate);
        return ("" + r + (yCoordinate + 1));
    }
}
