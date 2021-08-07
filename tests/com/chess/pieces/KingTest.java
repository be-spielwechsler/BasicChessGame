package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KingTest {
    private int xIndex;
    private int yIndex;

    String[] calculateKingsPotentialMoves(int xCoordinate, int yCoordinate) {
        CurrentCoordinates.setCoordinates(xCoordinate, yCoordinate);
        final Piece piece = PieceType.createPiece(PieceType.King);
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
    public void testKingsPotentialMoves() {
        xIndex =  ('D' - 'A');
        yIndex = (5 - 1);
        String[] s = calculateKingsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"D6", "C6", "E6", "D4", "C4", "E4", "C5", "E5"};
        assertArrayEquals(str, s);
    }

    @Test
    public void testKingsCornerMoves() {
        xIndex =  ('H' - 'A');
        yIndex = (8 - 1);
        String[] s = calculateKingsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"H7", "G7", "G8"};
        assertArrayEquals(str, s);
    }
}