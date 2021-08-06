package com.chess;

import java.util.ArrayList;

public abstract class Piece {

    protected Tile currentTile;

    public Piece(Tile currentTile)
    {
        this.currentTile=currentTile;
    }

    // public Tile getLocation(){
    //    return currentTile;
    //}
    public abstract ArrayList<Tile> potentialMoves(Board board);
}
