package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class QueenTest {
    private int xIndex;
    private int yIndex;

    String[] calculateQueensPotentialMoves(int xCoordinate, int yCoordinate) {
        Board.initializeBoard(xCoordinate, yCoordinate);
        final Piece piece = PieceType.createPiece(PieceType.Queen);
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
    public void testQueensPotentialMoves() {
        xIndex = 3;
        yIndex = 4;
        String[] s = calculateQueensPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"C5", "B5", "A5", "E5", "F5", "G5", "H5", "D4", "D3", "D2", "D1", "D6",
                "D7", "D8", "E6", "F7", "G8", "E4", "F3", "G2", "H1", "C6", "B7", "A8", "C4", "B3", "A2" };
        assertArrayEquals(str, s);
    }

    @Test
    public void testQueensCornerMoves() {
        xIndex =  0;
        yIndex = 0;
        String[] s = calculateQueensPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"B1", "C1", "D1", "E1", "F1", "G1", "H1", "A2", "A3", "A4", "A5", "A6",
                "A7", "A8", "B2", "C3", "D4", "E5", "F6", "G7", "H8" };
        assertArrayEquals(str, s);
    }
}