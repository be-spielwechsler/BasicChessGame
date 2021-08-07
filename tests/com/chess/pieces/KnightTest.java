package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KnightTest {
    private int xIndex;
    private int yIndex;

    String[] calculateKnightsPotentialMoves(int xCoordinate, int yCoordinate) {
        CurrentCoordinates.setCoordinates(xCoordinate, yCoordinate);
        final Piece piece = PieceType.createPiece(PieceType.Knight);
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
    public void testKnightsPotentialMoves() {
        xIndex = ('E' - 'A');
        yIndex = (3 - 1);
        String[] s = calculateKnightsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"G4", "G2", "C4", "C2", "F5", "D5", "F1", "D1"};
        assertArrayEquals(str, s);
    }

    @Test
    public void testKnightsCornerMoves() {
        xIndex =  ('H' - 'A');
        yIndex = (1 - 1);
        String[] s = calculateKnightsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"F2", "G3"};
        assertArrayEquals(str, s);
    }
}