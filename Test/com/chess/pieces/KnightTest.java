package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KnightTest {

    @Test

    public void testPotentialMoves()
    {

        final int xIndex=(int) ('E'-'A');
        final int yIndex=  (3-1);

        Location location= new Location(xIndex,yIndex);
        Tile currentTile= new Tile(location,location.toString());
        final Piece piece= PieceType.createPiece(PieceType.Knight,currentTile);
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
        String[] str=  new String[]{"G4", "F5", "G2", "F1", "C4", "D5", "C2", "D1"  };

        return  str;
    }


}