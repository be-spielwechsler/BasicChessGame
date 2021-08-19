package com.chess;

import java.util.ArrayList;

public interface Piece {
    int upRight = 1, downLeft = 2, upLeft = 3, downRight = 4, right = 5, left = 6, up = 7, down = 8;

    ArrayList<Tile> potentialMoves();
}
