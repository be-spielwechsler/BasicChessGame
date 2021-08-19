package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.DiagonalMoves;

import java.util.ArrayList;

public class Bishop extends DiagonalMoves implements Piece {


    @Override
    public  ArrayList<Tile> potentialMoves() {
        int steps=8;
        ArrayList<Tile> allMoves;
        allMoves=moveDiagonallyClockwise(steps,upRight);
        allMoves.addAll(moveDiagonallyAnticlockwise(steps,downRight));
        allMoves.addAll(moveDiagonallyAnticlockwise(steps,upLeft));
        allMoves.addAll(moveDiagonallyClockwise(steps,downLeft));
        return allMoves;
    }

}
