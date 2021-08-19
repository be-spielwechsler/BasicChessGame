package com.chess;

public class CurrentLocation {
    private static int xCoordinate;
    private static int yCoordinate;

    public CurrentLocation(int xCoordinate, int yCoordinate) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public static int getxCoordinate() {
        return xCoordinate;
    }

    public static int getyCoordinate() {
        return yCoordinate;
    }

    public String toString() {
        char r = (char) ('A' + xCoordinate);
        return ("" + r + (yCoordinate + 1));
    }
}
