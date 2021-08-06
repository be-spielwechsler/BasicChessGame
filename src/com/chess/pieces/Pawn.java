package com.chess.pieces;

import com.chess.Board;
import com.chess.Location;
import com.chess.Piece;
import com.chess.Tile;

import java.util.ArrayList;

public class Pawn extends Piece {
    //  private boolean firstAdvance;

    //  public Pawn()
    // {
    //     firstAdvance=true;
    // }

    // to initialize the currentTile variable of Piece abstract class so that when different pieces extends the Piece abstract class..
    //..they already known from which current tile we have to calculate the possible moves
    //..and PieceType class pass this currentTile object reference to different pieces at the time it was in the...
    //..process of making the object of different concrete pieces
    public Pawn(Tile currentTile){
        super(currentTile);
    }
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

        if(X+1<width)
        {
            moves.add(currentBoard[X+1][Y]);
           /* if(X+1<width)
            {
                moves.add(currentBoard[X+1][Y+1]);
            }
            if(X-1>=0)
            {
                moves.add(currentBoard[X-1][Y+1]);
            }

            */
        }
        //    if(myY+2<height && firstAdvance)
        //    {
        //        moves.add(currentBoard[myX][myY+2]);
        //    }

        return moves;
    }
}
