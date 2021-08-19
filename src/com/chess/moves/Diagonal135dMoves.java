package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class Diagonal135dMoves {
    private static int upLeft = 3, downRight = 4;
    private static int xPoint, yPoint;

    public static void initializeCurrentTile() {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static ArrayList<Tile> move135dDiagonally(int steps, int direction) {
        ArrayList<Tile> moves = new ArrayList<>();
        int count = 0;
        if (direction == upLeft)
            for (int xSide = (xPoint - 1), ySide = (yPoint + 1); xSide >= 0 && Board.isVerticalMoveValid(ySide) && count < steps; xSide--, ySide++) {
                moves.add(Board.getBoardTile(xSide, ySide));
                count++;
            }
        if (direction == downRight)
            for (int xSide = (xPoint + 1), ySide = (yPoint - 1); Board.isHorizontalMoveValid(xSide) && ySide >= 0 && count < steps; xSide++, ySide--) {
                moves.add(Board.getBoardTile(xSide, ySide));
                count++;
            }
        return moves;
    }
}
