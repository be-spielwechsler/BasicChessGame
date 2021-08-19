package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class Diagonal45dMoves {
    private static int upRight = 1, downLeft = 2;
    private static int xPoint, yPoint;

    public static void initializeCurrentTile() {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static ArrayList<Tile> move45dDiagonally(int steps, int direction) {
        ArrayList<Tile> moves = new ArrayList<>();
        int count = 0;
        if (direction == upRight)
            for (int xSide = (xPoint + 1), ySide = (yPoint + 1); Board.isHorizontalMoveValid(xSide) && Board.isVerticalMoveValid(ySide) && count < steps; xSide++, ySide++) {
                moves.add(Board.getBoardTile(xSide, ySide));
                count++;
            }
        if (direction == downLeft)
            for (int xSide = (xPoint - 1), ySide = (yPoint - 1); xSide >= 0 && ySide >= 0 && count < steps; xSide--, ySide--) {
                moves.add(Board.getBoardTile(xSide, ySide));
                count++;
            }
        return moves;
    }

}
