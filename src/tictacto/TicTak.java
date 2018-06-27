package tictacto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TicTak extends Pane {

    protected final ImageView imageView;
    protected final Button play;
    protected final Button exit;
    public static Connection conn;
    public TicTak(Stage Stage1) {

        imageView = new ImageView();
        play = new Button();
        exit = new Button();

        setMaxHeight(351.0);
        setMaxWidth(425.0);
        setMinHeight(321.0);
        setMinWidth(400.0);
        setPrefHeight(351.0);
        setPrefWidth(419.0);

        imageView.setFitHeight(350.0);
        imageView.setFitWidth(425.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("home.png").toExternalForm()));

        play.setLayoutX(140.0);
        play.setLayoutY(119.0);
        play.setMnemonicParsing(false);
        play.setOpacity(0.0);
        play.setPrefHeight(48.0);
        play.setPrefWidth(132.0);
        play.setText("Button");
        play.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) { 
         String url = "jdbc:sqlite:tictacto";
          try {
              conn = DriverManager.getConnection(url);
          } catch (SQLException ex) {
              Logger.getLogger(TicTak.class.getName()).log(Level.SEVERE, null, ex);
          }
          System.out.println("hello"); 
           TicTak2 root = new TicTak2(Stage1);
               Scene scene = new Scene(root, 422, 350);
        
        Stage1.setTitle("TicTacToe");
        Stage1.setScene(scene);
        Stage1.show();
      }
      }); 
        
        
        
        
        
        exit.setLayoutX(137.0);
        exit.setLayoutY(196.0);
        exit.setMnemonicParsing(false);
        exit.setOpacity(0.0);
        exit.setPrefHeight(48.0);
        exit.setPrefWidth(132.0);
        exit.setText("Button");
        exit.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) { 
          
          System.exit(0);
           
      }
      }); 
        getChildren().add(imageView);
        getChildren().add(play);
        getChildren().add(exit);

    }
}
