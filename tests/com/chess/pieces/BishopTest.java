package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BishopTest {
    private int xIndex;
    private int yIndex;

    String[] calculateBishopsPotentialMoves(int xCoordinate, int yCoordinate) {
        CurrentCoordinates.setCoordinates(xCoordinate, yCoordinate);
        final Piece piece = PieceType.createPiece(PieceType.Bishop);
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
    public void testBishopsPotentialMoves() {
        xIndex =  ('E' - 'A');
        yIndex = (3 - 1);
        String[] s = calculateBishopsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"F4", "G5", "H6", "F2", "G1", "D4", "C5", "B6", "A7", "D2", "C1"};
        assertArrayEquals(str, s);
    }

    @Test
    public void testBishopsCornerMoves() {
        xIndex = ('H' - 'A');
        yIndex = (8 - 1);
        String[] s = calculateBishopsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"G7", "F6", "E5", "D4", "C3", "B2", "A1"};
        assertArrayEquals(str, s);
    }
}