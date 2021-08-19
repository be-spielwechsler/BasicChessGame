package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.ZeroAnd90DMoves;

import java.util.ArrayList;

public class Rook extends ZeroAnd90DMoves implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        int steps = 8;
        ArrayList<Tile> allMoves;
        allMoves = moveHorizontalInSameRow(steps, left);
        allMoves.addAll(moveHorizontalInSameRow(steps, right));
        allMoves.addAll(moveVerticalInSameColumn(steps, down));
        allMoves.addAll(moveVerticalInSameColumn(steps, up));
        return allMoves;
    }
}
