package com.thoughtworks.tictactoe;

import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class PlayerTest {
    @Test
    public void shouldPromptPlayerToIndicateTileWhenPlayersTurn() throws Exception {
        PrintStream printStream = mock(PrintStream.class);
        String playerNumber = "number";
        String playerMark = "mark";
        Player player = new Player(playerNumber, playerMark, printStream);

        player.takeTurn();

        verify(printStream).println("Player " + playerNumber + ", which tile do you want to mark?");

    }
}