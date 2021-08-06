package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QueenTest {

    @Test

    public void queenCanMoveInAllDirections() {

        final int xIndex = (int) ('D' - 'A');
        final int yIndex = (5 - 1);

        Location location = new Location(xIndex, yIndex);
        Tile currentTile = new Tile(location, location.toString());
        final Piece piece = PieceType.createPiece(PieceType.Queen, currentTile);
        final ArrayList<Tile> moves = piece.potentialMoves(new Board(8, 8));
        String[] s = new String[moves.size()];
        int k = 0;
        for (Tile i : moves) {
            s[k] = (i.getLocation().toString());
            k++;
        }

        assertArrayEquals(expectedOutput(), s);

    }


    String[] expectedOutput() {
        String[] str = new String[]{"A5", "B5", "C5", "E5", "F5", "G5", "H5", "D1", "D2", "D3", "D4",
                "D6", "D7", "D8", "E6", "F7", "G8", "E4", "F3", "G2", "H1", "C6", "B7",
                "A8", "C4", "B3", "A2"};
        return str;
    }
}