package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KnightTest {
    private int xIndex;
    private int yIndex;

    String[] calculateKnightsPotentialMoves(int xCoordinate, int yCoordinate) {
        Board.initializeBoard(xCoordinate, yCoordinate);
        final Piece piece = PieceType.createPiece(PieceType.Knight);
        final ArrayList<Tile> allMoves = piece.potentialMoves();
        String[] s = new String[allMoves.size()];
        int count = 0;
        for (Tile tile : allMoves) {
            s[count] = (tile.getTileName());
            count++;
        }
        return s;
    }

    @Test
    public void testKnightsPotentialMoves() {
        xIndex = 4;
        yIndex = 2;
        String[] s = calculateKnightsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"G4", "G2", "C4", "C2", "F5", "D5", "F1", "D1"};
        assertArrayEquals(str, s);
    }

    @Test
    public void testKnightsCornerMoves() {
        xIndex =  7;
        yIndex = 0;
        String[] s = calculateKnightsPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"F2", "G3"};
        assertArrayEquals(str, s);
    }
}