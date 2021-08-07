package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Queen extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps=8;
        //upRight=1,downLeft=2,upLeft=1,downRight=2,right=1,left=2,up=1,down=2;
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveHorizontalInSameRow(allMoves,steps,left);
        moveHorizontalInSameRow(allMoves,steps,right);
        moveVerticalInSameColumn(allMoves,steps,down);
        moveVerticalInSameColumn(allMoves,steps,up);
        moveDiagonallyClockwise(allMoves,steps,upRight);
        moveDiagonallyAnticlockwise(allMoves,steps,downRight);
        moveDiagonallyAnticlockwise(allMoves,steps,upLeft);
        moveDiagonallyClockwise(allMoves,steps,downLeft);

        return allMoves;
    }
}
