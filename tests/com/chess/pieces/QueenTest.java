package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QueenTest {
    private int xIndex;
    private int yIndex;

    String[] calculateQueensPotentialMoves(int xCoordinate, int yCoordinate) {
        CurrentCoordinates.setCoordinates(xCoordinate, yCoordinate);
        final Piece piece = PieceType.createPiece(PieceType.Queen);
        final ArrayList<Tile> allMoves = piece.potentialMoves();
        String[] s = new String[allMoves.size()];
        int count = 0;
        for (Tile tile : allMoves) {
            s[count] = (tile.getCurrentLocation().toString());
            count++;
        }
        return s;
    }

    @Test
    public void testQueensPotentialMoves() {
        xIndex = ('D' - 'A');
        yIndex = (5 - 1);
        String[] s = calculateQueensPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"A5", "B5", "C5", "E5", "F5", "G5", "H5", "D1", "D2", "D3", "D4",
                "D6", "D7", "D8", "E6", "F7", "G8", "E4", "F3", "G2", "H1", "C6", "B7",
                "A8", "C4", "B3", "A2"};
        assertArrayEquals(str, s);
    }

    @Test
    public void testQueensCornerMoves() {
        xIndex =  ('A' - 'A');
        yIndex = (1 - 1);
        String[] s = calculateQueensPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"A8", "B8", "C8", "D8", "E8", "F8", "G8", "H1", "H2", "H3",
                "H4", "H5", "H6", "H7", "G7", "F6", "E5", "D4", "C3", "B2", "A1"};
        // assertArrayEquals(str, s);
    }
}