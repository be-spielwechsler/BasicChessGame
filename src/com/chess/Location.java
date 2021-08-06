package com.chess;

public class Location {
    private final int x; // horizontal coordinate
    private final int y; // vertical coordinate

    public Location(int tileX,int tileY)
    {
        x=tileX;
        y=tileY;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public String toString()
    {
        char r=(char) ('A'+x); // increase x co-ordinate value with 1 so that at output it will shown correctly
        return (""+r+(y+1));   // increase y co-ordinate value with 1 so that at output it will shown correctly
    }
}
