package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class Lower5by2Moves {
    private static int xPoint, yPoint;

    public static void initializeCurrentTile() {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static ArrayList<Tile> moveRight2Down1() {
        ArrayList<Tile> moves = new ArrayList<>();
        if (Board.isHorizontalMoveValid(xPoint + 2) && yPoint - 1 >= 0)
            moves.add(Board.getBoardTile(xPoint + 2, yPoint - 1));
        return moves;
    }

    public static ArrayList<Tile> moveDown2Right1() {
        ArrayList<Tile> moves = new ArrayList<>();
        if (Board.isHorizontalMoveValid(xPoint + 1) && yPoint - 2 >= 0)
            moves.add(Board.getBoardTile(xPoint + 1, yPoint - 2));
        return moves;
    }

    public static ArrayList<Tile> moveLeft2Down1() {
        ArrayList<Tile> moves = new ArrayList<>();
        if (xPoint - 2 >= 0 && yPoint - 1 >= 0)
            moves.add(Board.getBoardTile(xPoint - 2, yPoint - 1));
        return moves;
    }

    public static ArrayList<Tile> moveDown2Left1() {
        ArrayList<Tile> moves = new ArrayList<>();
        if (xPoint - 1 >= 0 && yPoint - 2 >= 0)
            moves.add(Board.getBoardTile(xPoint - 1, yPoint - 2));
        return moves;
    }
}
