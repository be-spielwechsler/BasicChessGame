package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Pawn extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps=1;
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveVerticalInSameColumn(allMoves,steps,up);
        return allMoves;
    }
}
