package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.Diagonal135dMoves;
import com.chess.moves.Diagonal45dMoves;

import java.util.ArrayList;

public class Bishop implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps = 8;
        ArrayList<Tile> allMoves;
        Diagonal45dMoves.initializeCurrentTile();
        Diagonal135dMoves.initializeCurrentTile();
        allMoves = Diagonal45dMoves.move45dDiagonally(steps, upRight);
        allMoves.addAll(Diagonal135dMoves.move135dDiagonally(steps, downRight));
        allMoves.addAll(Diagonal135dMoves.move135dDiagonally(steps, upLeft));
        allMoves.addAll(Diagonal45dMoves.move45dDiagonally(steps, downLeft));
        return allMoves;
    }
}
