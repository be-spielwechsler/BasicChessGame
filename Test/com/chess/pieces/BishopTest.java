package com.chess.pieces;

import com.chess.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BishopTest {

    @Test
    public void bishopCanMoveDiagonally()
    {

        final int xIndex=(int) ('E'-'A');  // treat 'A' --> 0th index at x axis
        final int yIndex=  (3-1);  // treat 1----> 0th index at y axis

        //Creates the currentTile object by passing the input co-ordinates
        Location location= new Location(xIndex,yIndex); // passing input co-ordinates to location to get location reference variable
        Tile currentTile= new Tile(location,location.toString()); // passing location reference variable to Tile class to...
        // ..get Tile object reference variable

        // passes  currentTile to PieceType so that it can further pass it to concrete Piece constructor and in-turn used...
        // ..to initialize the currentTile variable in the  Piece abstract Class
        //  PieceType will return Piece Object.
        final Piece piece= PieceType.createPiece(PieceType.Bishop,currentTile);

        //call potentialMove method to get the moves of piece
        final ArrayList<Tile> moves= piece.potentialMoves(new Board(8,8));
        String[] s= new String[moves.size()];
        int k=0;

        // moves is a Tile type ArrayList...so use string array to extract the co-ordinates of Tiles on which the piece can move..

        for(Tile i : moves)
        {
            s[k]=(i.getLocation().toString());
            k++;
        }
        // to check if expected output is equal to real output or not
        assertArrayEquals(expectedOutput(),s);

    }


    String[] expectedOutput()
    {
        String[] str=  new String[]{"F4", "G5", "H6", "F2", "G1", "D4", "C5", "B6", "A7", "D2", "C1" };

        return  str;
    }



}