package com.chess;

import com.chess.pieces.*;

import java.util.Arrays;

public enum PieceType {
    King, Queen, Bishop, Knight, Rook, Pawn;

    static public PieceType type(String typeStr) {
        return Arrays
                .stream(PieceType.values())
                .filter(type -> type.toString().equalsIgnoreCase(typeStr))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("com.chessboard.models.Piece type is invalid "));
    }

    static public Piece createPiece(PieceType type) {
        switch (type) {
            case King:
                return new King();
            case Queen:
                return new Queen();
            case Bishop:
                return new Bishop();
            case Knight:
                return new Knight();
            case Rook:
                return new Rook();
            case Pawn:
                return new Pawn();
        }
        return null;
    }
}
