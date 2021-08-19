package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class HorizontalMoves {
    private static int right = 5, left = 6;
    private static int xPoint, yPoint;

    public static void initializeCurrentTile() {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static ArrayList<Tile> move0Degree(int steps, int direction) {
        ArrayList<Tile> moves = new ArrayList<Tile>();
        int count = 0;
        if (direction == right)
            for (int xSide = xPoint + 1; Board.isHorizontalMoveValid(xSide) && count < steps; xSide++) {
                moves.add(Board.getBoardTile(xSide, yPoint));
                count++;
            }
        if (direction == left)
            for (int xSide = xPoint - 1; xSide >= 0 && count < steps; xSide--) {
                moves.add(Board.getBoardTile(xSide, yPoint));
                count++;
            }
        return moves;
    }

}
