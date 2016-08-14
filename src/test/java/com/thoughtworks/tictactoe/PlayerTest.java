package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PlayerTest {

    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private Board board;
    private String playerNumber;
    private String playerMark;
    private Player player;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        playerNumber = "number";
        playerMark = "mark";
        player = new Player(playerNumber, playerMark, board, printStream, bufferedReader);
    }

    @Test
    public void shouldPromptPlayerToIndicateTileWhenPlayersTurn() throws Exception {
        player.takeTurn();

        verify(printStream).println("Player " + playerNumber + ", which tile do you want to mark?");
    }

    @Test
    public void shouldAllowPlayerToEnterDesiredTileWhenPlayersTurn() throws Exception {
        player.takeTurn();

        verify(bufferedReader).readLine();
    }

    @Test
    public void shouldMarkBoardWhenPlayerSelectsTile() throws Exception {
        player.takeTurn();

        verify(board).markTile(-1, this.playerMark);
    }

    @Test
    public void shouldRedrawBoardWhenTileMarked() throws Exception {
        player.takeTurn();

        verify(board).draw();
    }
}