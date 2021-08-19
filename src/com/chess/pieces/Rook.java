package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.HorizontalMoves;
import com.chess.moves.VerticalMoves;

import java.util.ArrayList;

public class Rook implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps = 8;
        ArrayList<Tile> allMoves;
        HorizontalMoves.initializeCurrentTile();
        VerticalMoves.initializeCurrentTile();
        allMoves = HorizontalMoves.move0Degree(steps, left);
        allMoves.addAll(HorizontalMoves.move0Degree(steps, right));
        allMoves.addAll(VerticalMoves.move90Degree(steps, down));
        allMoves.addAll(VerticalMoves.move90Degree(steps, up));
        return allMoves;
    }
}
