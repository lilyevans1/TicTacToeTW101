package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class TicTacToeTest {

    private Board board;
    private Player player1;
    //private Player player2;
    private TicTacToe ticTacToe;

    @Before
    public void setUp() throws Exception {
        board = mock(Board.class);
        player1 = mock(Player.class);
        ticTacToe = new TicTacToe(board, player1);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts() throws Exception {
        ticTacToe.start();

        verify(board).draw();
    }

    @Test
    public void shouldExecutePlayerOneTurnWhenGameStarts() throws Exception {
        ticTacToe.start();

        verify(player1).takeTurn();

    }
}