package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class King extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps=1;
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveVerticalInSameColumn(allMoves,steps,up);
        moveDiagonallyAnticlockwise(allMoves,steps,upLeft);
        moveDiagonallyClockwise(allMoves,steps,upRight);
        moveVerticalInSameColumn(allMoves,steps,down);
        moveDiagonallyClockwise(allMoves,steps,downLeft);
        moveDiagonallyAnticlockwise(allMoves,steps,downRight);
        moveHorizontalInSameRow(allMoves,steps,left);
        moveHorizontalInSameRow(allMoves,steps,right);
        return allMoves;
    }
}
