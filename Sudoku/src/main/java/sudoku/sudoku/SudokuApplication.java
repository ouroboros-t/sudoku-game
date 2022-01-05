package sudoku.sudoku;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sudoku.sudoku.buildlogic.SudokuBuildLogic;
import sudoku.sudoku.userinterface.IUserInterfaceContract;
import sudoku.sudoku.userinterface.UserInterfaceImpl;

import java.io.IOException;

public class SudokuApplication extends Application {
    private IUserInterfaceContract.View uiImpl;
    @Override
    public void start(Stage stage) throws IOException {
        uiImpl = new UserInterfaceImpl(stage);
        try {
            //sudoku build logic required to wire things together..
            SudokuBuildLogic.build(uiImpl);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}