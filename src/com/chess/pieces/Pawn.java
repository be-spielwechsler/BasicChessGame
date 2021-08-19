package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.OneOr2Step90DMoves;

import java.util.ArrayList;

public class Pawn extends OneOr2Step90DMoves implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        final int steps = 1;
        ArrayList<Tile> allMoves;
        allMoves = moveVerticalInSameColumn(steps, up);
        return allMoves;
    }
}
