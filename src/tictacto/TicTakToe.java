package tictacto;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class TicTakToe extends Application {
    
    
    @Override
    public void start(Stage primaryStage) {
        
        
    TicTak root = new TicTak(primaryStage);
         
        Scene scene = new Scene(root,410,340);
        
        primaryStage.setTitle("TicTacToe");
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
       primaryStage.setMaximized(false);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
