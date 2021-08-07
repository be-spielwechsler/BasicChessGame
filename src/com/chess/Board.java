package com.chess;

public class Board {
    protected Tile[][] allTiles;
    protected final int widthOfBoard = 8;
    protected final int heightOfBoard = 8;

    public Board() {
        allTiles = new Tile[widthOfBoard][heightOfBoard];
        initializeTiles(widthOfBoard, heightOfBoard);
    }

    private void initializeTiles(int width, int height) {
        for (int xSide = 0; xSide < width; xSide++) {
            for (int ySide = 0; ySide < height; ySide++) {
                CurrentLocation newTile = new CurrentLocation(xSide, ySide);
                allTiles[xSide][ySide] = new Tile(newTile, newTile.toString());

            }
        }
    }

    public int getWidthOfBoard() {
        return widthOfBoard;
    }
    public int getHeightOfBoard() {
        return heightOfBoard;
    }
    public Tile[][] getAllTiles() {
        return allTiles;
    }
}
