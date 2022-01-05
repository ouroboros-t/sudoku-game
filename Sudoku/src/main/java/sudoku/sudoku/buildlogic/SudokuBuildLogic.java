package sudoku.sudoku.buildlogic;

import sudoku.sudoku.computationlogic.GameLogic;
import sudoku.sudoku.persistence.LocalStorageImpl;
import sudoku.sudoku.problemdomain.IStorage;
import sudoku.sudoku.problemdomain.SudokuGame;
import sudoku.sudoku.userinterface.IUserInterfaceContract;
import sudoku.sudoku.userinterface.logic.ControlLogic;

import java.io.IOException;

public class SudokuBuildLogic {
    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try{
            initialState = storage.getGameData();
        }catch(IOException e){
            initialState = GameLogic.getNewGame();
        }


        IUserInterfaceContract.EventListener uiLogic = new ControlLogic(storage, userInterface);

        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);

    }


}
