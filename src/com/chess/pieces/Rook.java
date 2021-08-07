package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Rook extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        //int right=1,left=2,up=1,down=2,
        int steps=8;
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveHorizontalInSameRow(allMoves,steps,left);
        moveHorizontalInSameRow(allMoves,steps,right);
        moveVerticalInSameColumn(allMoves,steps,down);
        moveVerticalInSameColumn(allMoves,steps,up);
        return allMoves;
    }
}
