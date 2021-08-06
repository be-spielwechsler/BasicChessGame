package com.chess;

import java.util.ArrayList;
import java.util.Scanner;

public class Chess {
    public static void main(String[] args) {
        ArrayList<Tile> moves= new ArrayList<Tile>();

        //initialize board with 8*8 dimensions
        Board board= new Board(8,8);

        // scan inputs from the keyboard

        final Scanner scanner= new Scanner(System.in);


        //pass input piece_type to PieceType class and it will throws exception if piece type is not valid..
        //... this type reference variable of PieceType class is then pass to createPiece method of PieceType class
        final PieceType type=PieceType.type(scanner.next());


        // convert inputs eg--> D5 to the character array
        final char[] position = scanner.next().toCharArray();


        //Creates the currentTile object by passing the input co-ordinates
        final int xIndex=(int) (position[0]-'A'); // treat 'A' --> 0th index at x axis
        final int yIndex=  (position[1]-'1');     // treat 1----> 0th index at y axis
        Location location= new Location(xIndex,yIndex); // passing input co-ordinates to location to get location reference variable
        Tile currentTile= new Tile(location,location.toString()); // passing location reference variable to Tile class to...
        // ..get Tile object reference variable


        // passes  currentTile to PieceType so that it can further pass it to concrete Piece constructor and in-turn used...
        // ..to initialize the currentTile variable in the  Piece abstract Class
        //  PieceType will return Piece Object.
        final Piece piece= PieceType.createPiece(type,currentTile);

        //call potentialMove method to get the moves of piece
        moves=piece.potentialMoves(board);

        // moves is a Tile type ArrayList...so use location class to extract the co-ordinates of Tiles on which the piece can move..
        //...in empty chess board
        for(Tile i : moves)
        {
            System.out.print(i.getLocation().toString()+" ");
        }
        // System.out.print(moves.toArray());



    }
}
