package com.chess.pieces;

import com.chess.Board;
import com.chess.Location;
import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class King extends Piece {
    // to initialize the currentTile variable of Piece abstract class so that when different pieces extends the Piece abstract class..
    //..they already known from which current tile we have to calculate the possible moves
    //..and PieceType class pass this currentTile object reference to different pieces at the time it was in the...
    //..process of making the object of different concrete pieces
    public King(Tile currentTile){
        super(currentTile);
    }
    /**
     * Evaluates the current position of the piece on the board and
     * returns an array of all the tiles that it might be possible for
     * the piece to move to.
     *
     *   @return A list of all possible moves for the piece.
     * */
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

        // Add each of the king's moves individually.

        if(Y+1<height)
        {
            moves.add(currentBoard[X][Y+1]);
            if(X-1>=0)
            {
                moves.add(currentBoard[X-1][Y+1]);
            }
            if(X+1<width)
            {
                moves.add(currentBoard[X+1][Y+1]);
            }
        }

        if(Y-1>=0)
        {
            moves.add(currentBoard[X][Y-1]);
            if(X-1>=0)
            {
                moves.add(currentBoard[X-1][Y-1]);
            }
            if(X+1<width)
            {
                moves.add(currentBoard[X+1][Y-1]);
            }
        }

        if(X-1>=0)
        {
            moves.add(currentBoard[X-1][Y]);
        }
        if(X+1<width)
        {
            moves.add(currentBoard[X+1][Y]);
        }
        return moves;
    }
}
