package com.chess.pieces;

import com.chess.Piece;
import com.chess.Tile;
import com.chess.moves.DiagonalMoves;
import com.chess.moves.ZeroAnd90DMoves;

import java.util.ArrayList;

public class King implements Piece {
    @Override
    public ArrayList<Tile> potentialMoves() {
        final int steps = 1;
        int upRight = 1, downLeft = 2, upLeft = 3, downRight = 4, right = 5, left = 6, up = 7, down = 8;
        ArrayList<Tile> allMoves;
        DiagonalMoves.initializeCurrentTile();
        ZeroAnd90DMoves.initializeCurrentTile();
        allMoves = ZeroAnd90DMoves.moveVerticalInSameColumn(steps, up);
        allMoves.addAll(DiagonalMoves.moveDiagonallyAnticlockwise(steps, upLeft));
        allMoves.addAll(DiagonalMoves.moveDiagonallyClockwise(steps, upRight));
        allMoves.addAll(ZeroAnd90DMoves.moveVerticalInSameColumn(steps, down));
        allMoves.addAll(DiagonalMoves.moveDiagonallyClockwise(steps, downLeft));
        allMoves.addAll(DiagonalMoves.moveDiagonallyAnticlockwise(steps, downRight));
        allMoves.addAll(ZeroAnd90DMoves.moveHorizontalInSameRow(steps, left));
        allMoves.addAll(ZeroAnd90DMoves.moveHorizontalInSameRow(steps, right));

        return allMoves;
    }
}
