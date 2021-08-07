package com.chess.pieces;
import com.chess.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class RookTest {
    private int xIndex;
    private int yIndex;
    String[] calculateRooksPotentialMoves(int xCoordinate, int yCoordinate) {
        CurrentCoordinates.setCoordinates(xCoordinate, yCoordinate);
        final Piece piece = PieceType.createPiece(PieceType.Rook);
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
    public void testRooksPotentialMoves() {
         xIndex = ('F' - 'A');
         yIndex = (3 - 1);
        String[] s = calculateRooksPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"A3", "B3", "C3", "D3", "E3", "G3", "H3", "F1", "F2", "F4", "F5", "F6", "F7", "F8"};
        assertArrayEquals(str, s);
    }

    @Test
    public void testRooksCornerMoves(){
         xIndex = ('A' - 'A');
         yIndex = (1- 1);
        String[] s = calculateRooksPotentialMoves(xIndex, yIndex);
        String[] str = new String[]{"B1", "C1", "D1", "E1", "F1", "G1", "H1", "A2", "A3", "A4", "A5", "A6", "A7", "A8" };
       assertArrayEquals(str, s);

    }
}