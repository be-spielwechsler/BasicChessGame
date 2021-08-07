package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Knight extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveRight2Up1(allMoves);
        moveRight2Down1(allMoves);
        moveLeft2Up1(allMoves);
        moveLeft2Down1(allMoves);
        moveUp2Right1(allMoves);
        moveUp2Left1(allMoves);
        moveDown2Right1(allMoves);
        moveDown2Left1(allMoves);
        return allMoves;
    }
}
