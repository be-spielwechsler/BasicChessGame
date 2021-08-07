package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class King extends Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        moveUpByOne(allMoves);
        moveUpLeftByOne(allMoves);
        moveUpRightByOne(allMoves);
        moveDownByOne(allMoves);
        moveDownLeftByOne(allMoves);
        moveDownRightByOne(allMoves);
        moveLeftByOne(allMoves);
        moveRightByOne(allMoves);
        return allMoves;
    }
}
