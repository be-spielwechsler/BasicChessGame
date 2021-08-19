package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class VerticalMoves {
    private static int up = 7, down = 8;
    private static int xPoint, yPoint;

    public static void initializeCurrentTile() {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static ArrayList<Tile> move90Degree(int steps, int direction) {
        ArrayList<Tile> moves = new ArrayList<Tile>();
        int count = 0;
        if (direction == up)
            for (int ySide = yPoint + 1; Board.isVerticalMoveValid(ySide) && count < steps; ySide++) {
                moves.add(Board.getBoardTile(xPoint, ySide));
                count++;
            }
        if (direction == down)
            for (int ySide = yPoint - 1; ySide >= 0 && count < steps; ySide--) {
                moves.add(Board.getBoardTile(xPoint, ySide));
                count++;
            }
        return moves;
    }

}
