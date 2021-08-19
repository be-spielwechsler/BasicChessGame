package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.Diagonal135dMoves;
import com.chess.moves.Diagonal45dMoves;
import com.chess.moves.HorizontalMoves;
import com.chess.moves.VerticalMoves;


import java.util.ArrayList;

public class King implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        final int steps = 1;
        ArrayList<Tile> allMoves;
        Diagonal45dMoves.initializeCurrentTile();
        Diagonal135dMoves.initializeCurrentTile();
        HorizontalMoves.initializeCurrentTile();
        VerticalMoves.initializeCurrentTile();
        allMoves = VerticalMoves.move90Degree(steps, up);
        allMoves.addAll(Diagonal135dMoves.move135dDiagonally(steps, upLeft));
        allMoves.addAll(Diagonal45dMoves.move45dDiagonally(steps, upRight));
        allMoves.addAll(VerticalMoves.move90Degree(steps, down));
        allMoves.addAll(Diagonal45dMoves.move45dDiagonally(steps, downLeft));
        allMoves.addAll(Diagonal135dMoves.move135dDiagonally(steps, downRight));
        allMoves.addAll(HorizontalMoves.move0Degree(steps, left));
        allMoves.addAll(HorizontalMoves.move0Degree(steps, right));
        return allMoves;
    }
}
