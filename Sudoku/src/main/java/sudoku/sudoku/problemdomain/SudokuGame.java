package sudoku.sudoku.problemdomain;

//import serializable so we can read game data to a file on OS
import sudoku.sudoku.computationlogic.SudokuUtilities;
import sudoku.sudoku.constants.GameState;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    public static final int GRID_BOUNDARY = 9;
    private final GameState gameState;
    private final int[][] gridState; //actual sudokugrid


    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.gridState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getCopyOfGridState() {
        return SudokuUtilities.copyToNewArray(gridState);
        //protects Sudoku game from being changed over time
    }
}
