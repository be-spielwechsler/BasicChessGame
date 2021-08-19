package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Queen implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps = 8;
        ArrayList<Tile> allMoves;
        Bishop bishop = new Bishop();
        Rook rook = new Rook();
        allMoves = rook.potentialMoves();
        allMoves.addAll(bishop.potentialMoves());
        return allMoves;
    }
}
