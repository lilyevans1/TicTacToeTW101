package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {
    private String playerNumber;
    private String playerMark;
    private PrintStream printStream;
    private BufferedReader bufferedReader;

    public Player(String playerNumber, String playerMark, PrintStream printStream, BufferedReader bufferedReader) {
        this.playerNumber = playerNumber;
        this.playerMark = playerMark;
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
    }

    public String takeTurn() throws IOException {
        printStream.println("Player " + playerNumber + ", which tile do you want to mark?");
        return bufferedReader.readLine();
    }
}
