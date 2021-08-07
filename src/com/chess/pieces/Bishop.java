package com.chess.pieces;

import com.chess.Board;
import com.chess.Location;
import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Bishop extends Piece {
    //  initialize the currentTile variable of Piece abstract class so that when different pieces extends the Piece abstract class..
    //..they already known from which current tile we have to calculate the possible moves
    //..and PieceType class pass this currentTile object reference to different pieces at the time it was in the...
    //..process of making the object of different concrete pieces
    public Bishop(Tile currentTile){
        super(currentTile);
    }

    /**
     * Evaluates the current position of the bishop on the board and
     * returns an array of all the tiles that it might be possible for
     * the bishop to move to.
     *
     * @param board The board with all tiles present.
     * @return A list of all possible moves for the bishop.
     */
    @Override
    public ArrayList<Tile> potentialMoves(Board board) {
        // to get the location reference variable of current tile
        Location myLocation= currentTile.getLocation();
        // to get the empty board having tiles
        Tile[][] currentBoard= board.getTiles();
        ArrayList<Tile> moves= new ArrayList<Tile>();

        int X= myLocation.getX();
        int Y= myLocation.getY();
        int width= board.getWidth();
        int height= board.getHeight();

        // Add all squares diagonally up and to the right from where we are.
        for(int i=(X+1),j=(Y+1);i<width && j<height;i++,j++)
        {
            moves.add(currentBoard[i][j]);
        }
        // Add all squares diagonally down and to the right from where we are.
        for(int i=(X+1),j=(Y-1);i<width && j>=0;i++,j--)
        {
            moves.add(currentBoard[i][j]);
        }


        // Add all squares diagonally up and to the left from where we are.
        for(int i=(X-1),j=(Y+1);i>=0 && j<height;i--,j++)
        {
            moves.add(currentBoard[i][j]);
        }
        // Add all squares diagonally down and to the left from where we are.
        for(int i=(X-1),j=(Y-1);i>=0 && j>=0;i--,j--)
        {
            moves.add(currentBoard[i][j]);
        }
        return moves;
    }
}
