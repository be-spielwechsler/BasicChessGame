package com.chess;

import com.chess.pieces.*;

import java.util.Arrays;

/**
 *  enum have a static values method that returns an array containing all of the values of the enum in the
 *  order they are declared
 *
 * The stream(T[] array) method of Arrays class in Java, is used to get a Sequential Stream from the
 * array passed as the parameter with its elements
 *
 * Stream filter(Predicate predicate) returns a stream consisting of the elements
 * of this stream that match the given predicate.
 *
 * The equalsIgnoreCase() method compares two strings irrespective of the case (lower or upper) of the string.
 *
 * Stream findFirst() returns an Optional (a container object which may or may not contain a
 * non-null value) describing the first element of this stream, or an empty Optional if the stream is empty.
 *
 * : If the element selected is null, NullPointerException is thrown.
 *
 * The orElseThrow() method of java.util.Optional class in Java is used to get the value of this
 * Optional instance if present. If there is no value present in this Optional instance,
 * then this method throws the exception generated from the specified supplier.
 */


public enum PieceType {
    King, Queen, Bishop, Knight, Rook, Pawn;
    static public PieceType type(String typeStr) {
        return Arrays
                .stream(PieceType.values())
                .filter(type -> type.toString().equalsIgnoreCase(typeStr))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("com.chessboard.models.Piece type is invalid "));
    }
    // used to create the objects of Concrete Piece Classes based on the type input...
    //..and pass the currentTile reference variable to Concrete Piece Class constructor..
    //.. which in-turn uses to initialize currentTile variable of Piece abstract class
    static public Piece createPiece(PieceType type, Tile currentTile) {
        switch (type) {

            case King:
                return new King(currentTile);
            case Queen:
                return new Queen(currentTile);
            case Bishop:
                return new Bishop(currentTile);
            case Knight:
                return new Knight(currentTile);
            case Rook:
                return new Rook(currentTile);
            case Pawn:
                return new Pawn(currentTile);
        }
        return null;
    }
}
