package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class OneOr2Step90DMoves {
    protected  int up=7;
    private  int xPoint,yPoint;
    ArrayList<Tile> moves= new ArrayList<>();

    public OneOr2Step90DMoves()
    {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }
    public ArrayList<Tile> moveVerticalInSameColumn(int steps, int direction) {
        int count = 0;
        if (direction == up && steps<=2)
            for (int ySide = yPoint + 1; Board.isVerticalMoveValid(ySide) && count < steps; ySide++) {
                moves.add(Board.getBoardTile(xPoint,ySide));
                count++;
            }
        return moves;
    }
}
