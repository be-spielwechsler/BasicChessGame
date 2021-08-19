package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.Lower5by2Moves;
import com.chess.moves.Upper5by2Moves;

import java.util.ArrayList;

public class Knight implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        ArrayList<Tile> allMoves;
        Upper5by2Moves.initializeCurrentTile();
        Lower5by2Moves.initializeCurrentTile();
        allMoves = Upper5by2Moves.moveRight2Up1();
        allMoves.addAll(Lower5by2Moves.moveRight2Down1());
        allMoves.addAll(Upper5by2Moves.moveLeft2Up1());
        allMoves.addAll(Lower5by2Moves.moveLeft2Down1());
        allMoves.addAll(Upper5by2Moves.moveUp2Right1());
        allMoves.addAll(Upper5by2Moves.moveUp2Left1());
        allMoves.addAll(Lower5by2Moves.moveDown2Right1());
        allMoves.addAll(Lower5by2Moves.moveDown2Left1());
        return allMoves;
    }
}
