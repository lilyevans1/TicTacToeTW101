package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {
    private String playerNumber;
    private String playerMark;
    private Board board;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Player(String playerNumber, String playerMark, Board board, PrintStream printStream, BufferedReader bufferedReader) {
        this.playerNumber = playerNumber;
        this.playerMark = playerMark;
        this.board = board;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public void takeTurn() throws IOException {
        printStream.println("Player " + playerNumber + ", which tile do you want to mark?");
        String playerChoice = bufferedReader.readLine();
        int tilePosition = tileToTilePosition(playerChoice);

        printStream.println();

        board.markTile(tilePosition, this.playerMark);
        board.draw();
    }

    private int tileToTilePosition(String playerTileChoice){
        try {
            int position = Integer.parseInt(playerTileChoice) - 1;
            return position;
        }
        catch (NumberFormatException e){
            return -1;
        }

    }
}
