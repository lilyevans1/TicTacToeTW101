package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.List;

public class Board {
    private PrintStream printStream;
    private List<String> boardTiles;

    public Board(PrintStream printStream, List<String> boardTiles) {
        this.printStream = printStream;
        this.boardTiles = boardTiles;
    }

    public void draw() {
        String boardAsString = setupBoardDisplay();
        printStream.println(boardAsString);
    }

    private String setupBoardDisplay(){
        return String.format("%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s\n", boardTiles.toArray());
    }

    public void markTile(int tilePosition, String playerMark) {
        boardTiles.set(tilePosition, playerMark);
    }

    public boolean tileOccupied(int i) {
        return boardTiles.get(i).matches("[a-zA-Z]");
    }
}
