package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {

    private PrintStream printStream;
    private List<String> boardTiles;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        boardTiles = mock(List.class);
        board = new Board(printStream, boardTiles);
    }

    @Test
    public void shouldDisplayBoardTilesWhenDrawn() throws Exception {
        board.draw();

        verify(printStream).println(String.format("%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s\n", boardTiles.toArray()));
    }

    @Test
    public void shouldUpdateTileListWhenMarkingTileOne() throws Exception {
        board.markTile(0, "X");

        verify(boardTiles).set(0, "X");
    }

    @Test
    public void shouldUpdateTileListWhenMarkingTileFour() throws Exception {
        board.markTile(3, "Z");

        verify(boardTiles).set(3, "Z");
    }
}