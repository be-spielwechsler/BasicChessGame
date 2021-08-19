package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class ZeroAnd90DMoves {

   protected static int right=5,left=6,up=7,down=8;
    private static int xPoint,yPoint;


    public ZeroAnd90DMoves()
    {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static void initializeCurrentTile()
    {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static ArrayList<Tile> moveHorizontalInSameRow(int steps, int direction) {
         ArrayList<Tile> moves= new ArrayList<Tile>();
        int count = 0;
        if (direction == right)
            for (int xSide = xPoint + 1; Board.isHorizontalMoveValid(xSide) && count < steps; xSide++) {
                moves.add(Board.getBoardTile(xSide,yPoint));
                count++;
            }
        if (direction == left)
            for (int xSide = xPoint - 1; xSide >= 0 && count < steps; xSide--) {
                moves.add(Board.getBoardTile(xSide,yPoint));
                count++;
            }
        return moves;
    }


    public static ArrayList<Tile> moveVerticalInSameColumn(int steps, int direction) {
        ArrayList<Tile> moves= new ArrayList<Tile>();
        int count = 0;
        if (direction == up)
            for (int ySide = yPoint + 1; Board.isVerticalMoveValid(ySide) && count < steps; ySide++) {
                moves.add(Board.getBoardTile(xPoint,ySide));
                count++;
            }
        if (direction == down)
            for (int ySide = yPoint - 1; ySide >= 0 && count < steps; ySide--) {
                moves.add(Board.getBoardTile(xPoint,ySide));
                count++;
            }
        return moves;
    }

}
