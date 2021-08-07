package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Pawn extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveUpByOne(allMoves);
        return allMoves;
    }
}
