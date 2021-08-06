package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RookTest {

    @Test

    public void testPotentialMoves()
    {

        final int xIndex=(int) ('F'-'A');
        final int yIndex=  (3-1);

        Location location= new Location(xIndex,yIndex);
        Tile currentTile= new Tile(location,location.toString());
        final Piece piece= PieceType.createPiece(PieceType.Rook,currentTile);
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
        String[] str=  new String[]{"A3", "B3", "C3", "D3", "E3", "G3", "H3", "F1", "F2", "F4", "F5", "F6", "F7", "F8"  };

        return  str;
    }


}