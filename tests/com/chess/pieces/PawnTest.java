package com.chess.pieces;
import com.chess.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PawnTest {
    @Test
    public void testPawnPotentialMoves() {
        final int xIndex = 6;
        final int yIndex = 1;
        Board.initializeBoard(xIndex, yIndex);
        final Piece piece = PieceType.createPiece(PieceType.Pawn);
        final ArrayList<Tile> allMoves = piece.potentialMoves();
        String[] s = new String[allMoves.size()];
        int count = 0;
        for (Tile tile : allMoves) {
            s[count] = (tile.getTileName());
            count++;
        }
        String[] str = new String[]{"G3"};
        assertArrayEquals(str, s);
    }
}