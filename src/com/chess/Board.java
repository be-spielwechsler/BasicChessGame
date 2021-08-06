package com.chess;


public class Board {
    protected Tile[][] tiles; // A 2-D array for all tiles that used to make uo the board

    protected final int width; // width of board
    protected final int height; // height of board

    public Board(int boardWidth,int boardHeight)
    {
        tiles = new Tile[boardWidth][boardHeight];
        this.initializeTiles(boardWidth,boardHeight);

        width= boardWidth;
        height= boardHeight;

    }
    private void initializeTiles(int width,int height)
    {
        for(int i=0;i<width;i++)
        {
            for(int j=0;j<height;j++){
                Location newTile = new Location(i,j);
                tiles[i][j]= new Tile(newTile,newTile.toString());

            }
        }
    }

    public int getWidth()
    {
        return width;
    }
    public int getHeight()
    {
        return height;
    }
    public Tile[][] getTiles()
    {
        return tiles;
    }

}
