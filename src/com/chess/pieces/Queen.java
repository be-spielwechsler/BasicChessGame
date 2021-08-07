package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Queen extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveHorizontalInSameRow(allMoves);
        moveVerticalInSameColumn(allMoves);
        moveDiagonallyUpRight(allMoves);
        moveDiagonallyDownRight(allMoves);
        moveDiagonallyUpLeft(allMoves);
        moveDiagonallyDownLeft(allMoves);
        return allMoves;
    }
}
