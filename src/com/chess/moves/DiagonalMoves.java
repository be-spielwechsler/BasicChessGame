package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class DiagonalMoves {
   protected static int upRight=1,downLeft=2,upLeft=3,downRight=4;

    private static int xPoint,yPoint;

    public DiagonalMoves()
    {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }
   public static void initializeCurrentTile()
    {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public static ArrayList<Tile> moveDiagonallyAnticlockwise( int steps, int direction) {
         ArrayList<Tile> moves= new ArrayList<>();
        int count = 0;
        if (direction == upLeft)
            for (int xSide = (xPoint - 1), ySide = (yPoint + 1); xSide >= 0 && Board.isVerticalMoveValid(ySide) && count < steps; xSide--, ySide++) {
                moves.add(Board.getBoardTile(xSide,ySide));
                count++;
            }
        if (direction == downRight)
            for (int xSide = (xPoint + 1), ySide = (yPoint - 1); Board.isHorizontalMoveValid(xSide) && ySide >= 0 && count < steps; xSide++, ySide--) {
                moves.add(Board.getBoardTile(xSide,ySide));
                count++;
            }
        return moves;
    }

    public static ArrayList<Tile> moveDiagonallyClockwise(int steps, int direction) {
        ArrayList<Tile> moves= new ArrayList<>();
        int count = 0;
        if (direction == upRight)
            for (int xSide = (xPoint + 1), ySide = (yPoint + 1); Board.isHorizontalMoveValid(xSide) && Board.isVerticalMoveValid(ySide) && count < steps; xSide++, ySide++) {
                moves.add(Board.getBoardTile(xSide,ySide));
                count++;
            }
        if (direction == downLeft)
            for (int xSide = (xPoint - 1), ySide = (yPoint - 1); xSide >= 0 && ySide >= 0 && count < steps; xSide--, ySide--) {
                moves.add(Board.getBoardTile(xSide,ySide));
                count++;
            }
        return moves;
    }

}
