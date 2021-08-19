package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.TwoAndHalfMoves;

import java.util.ArrayList;

public class Knight extends TwoAndHalfMoves implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        ArrayList<Tile> allMoves;
        allMoves = moveRight2Up1();
        allMoves.addAll(moveRight2Down1());
        allMoves.addAll(moveLeft2Up1());
        allMoves.addAll(moveLeft2Down1());
        allMoves.addAll(moveUp2Right1());
        allMoves.addAll(moveUp2Left1());
        allMoves.addAll(moveDown2Right1());
        allMoves.addAll(moveDown2Left1());
        return allMoves;
    }
}
