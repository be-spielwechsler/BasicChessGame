package com.chess;

import java.util.ArrayList;

public abstract class Piece extends CurrentCoordinates {
    Board board = new Board();
    CurrentLocation location = new CurrentLocation(xCoordinate, yCoordinate);
    Tile currentTile = new Tile(location, location.toString());
    CurrentLocation myLocation = currentTile.getCurrentLocation();
    Tile[][] currentBoard = board.getAllTiles();

    int xPoint = myLocation.getxCoordinate();
    int yPoint = myLocation.getyCoordinate();
    int width = board.getWidthOfBoard();
    int height = board.getHeightOfBoard();
    public int upRight=1,downLeft=2,upLeft=3,downRight=4,right=5,left=6,up=7,down=8;


    public abstract ArrayList<Tile> potentialMoves();

    public void moveHorizontalInSameRow(ArrayList<Tile> moves, int steps, int direction) {
        int count = 0;
        if (direction == right)
            for (int xSide = xPoint + 1; xSide < width && count < steps; xSide++) {
                moves.add(currentBoard[xSide][yPoint]);
                count++;
            }
        if (direction == left)
            for (int xSide = xPoint - 1; xSide >= 0 && count < steps; xSide--) {
                moves.add(currentBoard[xSide][yPoint]);
                count++;
            }
    }

    public void moveVerticalInSameColumn(ArrayList<Tile> moves, int steps, int direction) {
        int count = 0;
        if (direction == up)
            for (int ySide = yPoint + 1; ySide < height && count < steps; ySide++) {
                moves.add(currentBoard[xPoint][ySide]);
                count++;
            }
        if (direction == down)
            for (int ySide = yPoint - 1; ySide >= 0 && count < steps; ySide--) {
                moves.add(currentBoard[xPoint][ySide]);
                count++;
            }
    }


    public void moveDiagonallyAnticlockwise(ArrayList<Tile> moves, int steps, int direction) {
        int count = 0;
        if (direction == upLeft)
            for (int xSide = (xPoint - 1), ySide = (yPoint + 1); xSide >= 0 && ySide < height && count < steps; xSide--, ySide++) {
                moves.add(currentBoard[xSide][ySide]);
                count++;
            }
        if (direction == downRight)
            for (int xSide = (xPoint + 1), ySide = (yPoint - 1); xSide < width && ySide >= 0 && count < steps; xSide++, ySide--) {
                moves.add(currentBoard[xSide][ySide]);
                count++;
            }
    }

    public void moveDiagonallyClockwise(ArrayList<Tile> moves, int steps, int direction) {
        int count = 0;
        if (direction == upRight)
            for (int xSide = (xPoint + 1), ySide = (yPoint + 1); xSide < width && ySide < height && count < steps; xSide++, ySide++) {
                moves.add(currentBoard[xSide][ySide]);
                count++;
            }
        if (direction == downLeft)
            for (int xSide = (xPoint - 1), ySide = (yPoint - 1); xSide >= 0 && ySide >= 0 && count < steps; xSide--, ySide--) {
                moves.add(currentBoard[xSide][ySide]);
                count++;
            }
    }


    public void moveRight2Up1(ArrayList<Tile> moves) {
        if (xPoint + 2 < width && yPoint + 1 < height)
            moves.add(currentBoard[xPoint + 2][yPoint + 1]);
    }

    public void moveUp2Right1(ArrayList<Tile> moves) {
        if (xPoint + 1 < width && yPoint + 2 < height)
            moves.add(currentBoard[xPoint + 1][yPoint + 2]);
    }

    public void moveRight2Down1(ArrayList<Tile> moves) {
        if (xPoint + 2 < width && yPoint - 1 >= 0)
            moves.add(currentBoard[xPoint + 2][yPoint - 1]);
    }

    public void moveDown2Right1(ArrayList<Tile> moves) {
        if (xPoint + 1 < width && yPoint - 2 >= 0)
            moves.add(currentBoard[xPoint + 1][yPoint - 2]);
    }

    public void moveLeft2Up1(ArrayList<Tile> moves) {
        if (xPoint - 2 >= 0 && yPoint + 1 < height)
            moves.add(currentBoard[xPoint - 2][yPoint + 1]);
    }

    public void moveUp2Left1(ArrayList<Tile> moves) {
        if (xPoint - 1 >= 0 && yPoint + 2 < height)
            moves.add(currentBoard[xPoint - 1][yPoint + 2]);
    }

    public void moveLeft2Down1(ArrayList<Tile> moves) {
        if (xPoint - 2 >= 0 && yPoint - 1 >= 0)
            moves.add(currentBoard[xPoint - 2][yPoint - 1]);
    }

    public void moveDown2Left1(ArrayList<Tile> moves) {
        if (xPoint - 1 >= 0 && yPoint - 2 >= 0)
            moves.add(currentBoard[xPoint - 1][yPoint - 2]);
    }


}
