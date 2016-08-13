package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PrintStream printStream = new PrintStream(System.out);
        List<String> boardTiles = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        Board board = new Board(printStream, boardTiles);
        Player player1 = new Player("1", "X", printStream);
        TicTacToe ticTacToe = new TicTacToe(board, player1);

        ticTacToe.start();
    }
}
