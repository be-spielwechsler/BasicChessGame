package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PawnTest {

    @Test

    public void testPotentialMoves()
    {

        final int xIndex=(int) ('G'-'A');
        final int yIndex=  (2-1);

        Location location= new Location(xIndex,yIndex);
        Tile currentTile= new Tile(location,location.toString());
        final Piece piece= PieceType.createPiece(PieceType.Pawn,currentTile);
        final ArrayList<Tile> moves= piece.potentialMoves(new Board(8,8));
        String[] s= new String[moves.size()];
        int k=0;
        for(Tile i : moves)
        {
            s[k]=(i.getLocation().toString());
            k++;
        }

        assertArrayEquals(expectedOutput(),s);

    }


    String[] expectedOutput()
    {
        String[] str=  new String[]{"H2" };

        return  str;
    }


}