package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KingTest {

    @Test

    public void testPotentialMoves()
    {

        final int xIndex=(int) ('D'-'A');
        final int yIndex=  (5-1);

        Location location= new Location(xIndex,yIndex);
        Tile currentTile= new Tile(location,location.toString());
        final Piece piece= PieceType.createPiece(PieceType.King,currentTile);
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
        String[] str=  new String[]{"D6", "C6", "E6", "D4", "C4", "E4", "C5", "E5" };

        return  str;
    }


}