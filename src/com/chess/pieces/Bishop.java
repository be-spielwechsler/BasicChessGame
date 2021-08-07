package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Bishop extends Piece {

    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps=8;
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveDiagonallyClockwise(allMoves,steps,upRight);
        moveDiagonallyAnticlockwise(allMoves,steps,downRight);
        moveDiagonallyAnticlockwise(allMoves,steps,upLeft);
        moveDiagonallyClockwise(allMoves,steps,downLeft);


        return allMoves;
    }
}
