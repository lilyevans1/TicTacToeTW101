package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Player {
    private String playerNumber;
    private String playerMark;
    private PrintStream printStream;

    public Player(String playerNumber, String playerMark, PrintStream printStream) {
        this.playerNumber = playerNumber;
        this.playerMark = playerMark;
        this.printStream = printStream;
    }

    public void takeTurn() {
        printStream.println("Player " + playerNumber + ", which tile do you want to mark?");
    }
}
