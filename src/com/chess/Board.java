package com.chess;

public class Board {
    private static Tile[][] allTiles;
    private static final int widthOfBoard = 8;
    private static final int heightOfBoard = 8;
    private static CurrentLocation location;
    private static Tile currentTile;

    public static void initializeBoard(int xCoordinate, int yCoordinate) {
        allTiles = new Tile[widthOfBoard][heightOfBoard];
        initializeTiles(widthOfBoard, heightOfBoard);
        location = new CurrentLocation(xCoordinate, yCoordinate);
        currentTile = new Tile(location, location.toString());
    }

    private static void initializeTiles(int width, int height) {
        for (int xSide = 0; xSide < width; xSide++) {
            for (int ySide = 0; ySide < height; ySide++) {
                CurrentLocation newTile = new CurrentLocation(xSide, ySide);
                allTiles[xSide][ySide] = new Tile(newTile, newTile.toString());

            }
        }
    }

    public static Tile getBoardTile(int xSide, int ySide) {

        return allTiles[xSide][ySide];
    }

    public static boolean isHorizontalMoveValid(int xSide) {
        if (xSide < widthOfBoard)
            return true;
        else
            return false;
    }

    public static boolean isVerticalMoveValid(int ySide) {
        if (ySide < heightOfBoard)
            return true;
        else
            return false;
    }

    public static int getCurrentXCoordinate() {
        return location.getxCoordinate();
    }

    public static int getCurrentYCoordinate() {
        return location.getyCoordinate();
    }
}
