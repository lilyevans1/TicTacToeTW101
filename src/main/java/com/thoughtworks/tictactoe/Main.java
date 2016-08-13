package com.thoughtworks.tictactoe;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        PrintStream printStream = new PrintStream(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> boardTiles = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        Board board = new Board(printStream, boardTiles);
        Player player1 = new Player("1", "X", printStream, bufferedReader);
        TicTacToe ticTacToe = new TicTacToe(board, player1);

        ticTacToe.start();
    }
}
