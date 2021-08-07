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

    public void moveDiagonallyUpRight(ArrayList<Tile> moves) {
        for (int xSide = (xPoint + 1), ySide = (yPoint + 1); xSide < width && ySide < height; xSide++, ySide++) {
            moves.add(currentBoard[xSide][ySide]);
        }
    }

    public void moveDiagonallyDownLeft(ArrayList<Tile> moves) {
        for (int xSide = (xPoint - 1), ySide = (yPoint - 1); xSide >= 0 && ySide >= 0; xSide--, ySide--) {
            moves.add(currentBoard[xSide][ySide]);
        }
    }

    public void moveDiagonallyUpLeft(ArrayList<Tile> moves) {
        for (int xSide = (xPoint - 1), ySide = (yPoint + 1); xSide >= 0 && ySide < height; xSide--, ySide++) {
            moves.add(currentBoard[xSide][ySide]);
        }
    }

    public void moveDiagonallyDownRight(ArrayList<Tile> moves) {
        for (int xSide = (xPoint + 1), ySide = (yPoint - 1); xSide < width && ySide >= 0; xSide++, ySide--) {
            moves.add(currentBoard[xSide][ySide]);
        }
    }

    public void moveHorizontalInSameRow(ArrayList<Tile> moves) {
        for (int xSide = 0; xSide < width; xSide++) {
            if (xSide != xPoint)
                moves.add(currentBoard[xSide][yPoint]);
        }
    }

    public void moveVerticalInSameColumn(ArrayList<Tile> moves) {
        for (int ySide = 0; ySide < height; ySide++) {
            if (ySide != yPoint)
                moves.add(currentBoard[xPoint][ySide]);
        }
    }

    public void moveUpByOne(ArrayList<Tile> moves) {
        if (yPoint + 1 < height)
            moves.add(currentBoard[xPoint][yPoint + 1]);
    }

    public void moveUpLeftByOne(ArrayList<Tile> moves) {
        if (yPoint + 1 < height && xPoint - 1 >= 0)
            moves.add(currentBoard[xPoint - 1][yPoint + 1]);
    }

    public void moveUpRightByOne(ArrayList<Tile> moves) {
        if (yPoint + 1 < height && xPoint + 1 < width)
            moves.add(currentBoard[xPoint + 1][yPoint + 1]);
    }

    public void moveDownByOne(ArrayList<Tile> moves) {
        if (yPoint - 1 >= 0)
            moves.add(currentBoard[xPoint][yPoint - 1]);
    }

    public void moveDownLeftByOne(ArrayList<Tile> moves) {
        if (yPoint - 1 >= 0 && xPoint - 1 >= 0)
            moves.add(currentBoard[xPoint - 1][yPoint - 1]);
    }

    public void moveDownRightByOne(ArrayList<Tile> moves) {
        if (yPoint - 1 >= 0 && xPoint + 1 < width)
            moves.add(currentBoard[xPoint + 1][yPoint - 1]);
    }

    public void moveLeftByOne(ArrayList<Tile> moves) {
        if (xPoint - 1 >= 0)
            moves.add(currentBoard[xPoint - 1][yPoint]);
    }

    public void moveRightByOne(ArrayList<Tile> moves) {
        if (xPoint + 1 < width)
            moves.add(currentBoard[xPoint + 1][yPoint]);
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

    public abstract ArrayList<Tile> potentialMoves();
}
