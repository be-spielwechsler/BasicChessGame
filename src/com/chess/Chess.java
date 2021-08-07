package com.chess;

import java.util.ArrayList;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        ArrayList<Tile> allMoves = new ArrayList<Tile>();
        final Scanner scanner = new Scanner(System.in);
        final PieceType type = PieceType.type(scanner.next());
        final char[] position = scanner.next().toCharArray();
        final int xIndex =  (position[0] - 'A');
        final int yIndex = (position[1] - '1');
        CurrentCoordinates.setCoordinates(xIndex, yIndex);
        final Piece piece = PieceType.createPiece(type);

        allMoves = piece.potentialMoves();
        for (Tile i : allMoves) {
            System.out.print(i.getCurrentLocation().toString() + " ");
        }
    }
}
