package com.chess;

import java.util.ArrayList;
import java.util.Scanner;

import static com.chess.Board.initializeBoard;

public class Chess {
    public static void main(String[] args) {
        ArrayList<Tile> allMoves;
        final Scanner scanner = new Scanner(System.in);
        final PieceType type = PieceType.type(scanner.next());
        final char[] position = scanner.next().toCharArray();
        final int xIndex =  (position[0] - 'A');
        final int yIndex = (position[1] - '1');
         Board.initializeBoard(xIndex,yIndex);
        final Piece piece = PieceType.createPiece(type);

        allMoves = piece.potentialMoves();
        for (Tile i : allMoves) {
            System.out.print(i.getTileName() + " ");
        }
    }
}
