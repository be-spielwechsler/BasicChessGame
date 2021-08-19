package com.chess.moves;

import com.chess.Board;
import com.chess.Tile;

import java.util.ArrayList;

public class TwoAndHalfMoves {
    private int xPoint,yPoint;


    public TwoAndHalfMoves()
    {
        xPoint = Board.getCurrentXCoordinate();
        yPoint = Board.getCurrentYCoordinate();
    }

    public ArrayList<Tile> moveRight2Up1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (Board.isHorizontalMoveValid(xPoint + 2)  && Board.isVerticalMoveValid(yPoint + 1))
            moves.add(Board.getBoardTile(xPoint + 2,yPoint + 1));
        return moves;
    }

    public ArrayList<Tile> moveUp2Right1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (Board.isHorizontalMoveValid(xPoint + 1) && Board.isVerticalMoveValid(yPoint + 2))
            moves.add(Board.getBoardTile(xPoint + 1,yPoint + 2));
        return moves;
    }

    public ArrayList<Tile> moveRight2Down1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (Board.isHorizontalMoveValid(xPoint + 2)  && yPoint - 1 >= 0)
            moves.add(Board.getBoardTile(xPoint + 2,yPoint - 1));
        return moves;
    }

    public ArrayList<Tile> moveDown2Right1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (Board.isHorizontalMoveValid(xPoint + 1)  && yPoint - 2 >= 0)
            moves.add(Board.getBoardTile(xPoint + 1,yPoint - 2));
        return moves;
    }

    public ArrayList<Tile> moveLeft2Up1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (xPoint - 2 >= 0 && Board.isVerticalMoveValid(yPoint + 1) )
            moves.add(Board.getBoardTile(xPoint - 2,yPoint + 1));
        return moves;
    }

    public ArrayList<Tile> moveUp2Left1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (xPoint - 1 >= 0 && Board.isVerticalMoveValid(yPoint + 2))
            moves.add(Board.getBoardTile(xPoint - 1,yPoint + 2));
        return moves;
    }

    public ArrayList<Tile> moveLeft2Down1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (xPoint - 2 >= 0 && yPoint - 1 >= 0)
            moves.add(Board.getBoardTile(xPoint - 2,yPoint - 1));
        return moves;
    }

    public ArrayList<Tile> moveDown2Left1() {
        ArrayList<Tile> moves= new ArrayList<>();
        if (xPoint - 1 >= 0 && yPoint - 2 >= 0)
            moves.add(Board.getBoardTile(xPoint - 1,yPoint - 2));
        return moves;
    }
}
