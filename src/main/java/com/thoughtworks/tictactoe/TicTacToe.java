package com.thoughtworks.tictactoe;

import java.io.IOException;

public class TicTacToe {
    
    private Board board;
    private Player player1;
    
    public TicTacToe(Board board, Player player1) {
        this.board = board;
        this.player1 = player1;
    }

    public void start() throws IOException {
        board.draw();
        player1.takeTurn();
    }
}
