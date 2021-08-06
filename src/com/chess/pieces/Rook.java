package com.chess.pieces;

import com.chess.Board;
import com.chess.Location;
import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Rook extends Piece {
    public Rook(Tile currentTile){
        super(currentTile);
    }
    @Override
    public ArrayList<Tile> potentialMoves(Board board) {
        Location myLocation= currentTile.getLocation();
        Tile[][] currentBoard= board.getTiles();
        ArrayList<Tile> moves= new ArrayList<Tile>();

        int X= myLocation.getX();
        int Y= myLocation.getY();
        int width= board.getWidth();
        int height= board.getHeight();

        // Add all squares in the same row besides the one we're on.
        for(int i=0;i<width;i++)
        {
            if(i!=X)
            {
                moves.add(currentBoard[i][Y]);
            }
        }

        // Add all squares in the same column besides the one we're on.
        for (int j=0;j<height;j++)
        {
            if(j!=Y)
            {
                moves.add(currentBoard[X][j]);
            }
        }
        return moves;
    }
}
