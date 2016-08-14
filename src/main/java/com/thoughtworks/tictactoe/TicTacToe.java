package com.thoughtworks.tictactoe;

import java.io.IOException;

public class TicTacToe {
    
    private Board board;
    private Player player1;
    private Player player2;
    
    public TicTacToe(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
    }

    public void start() throws IOException {
        board.draw();
        player1.takeTurn();
        player2.takeTurn();
    }
}
