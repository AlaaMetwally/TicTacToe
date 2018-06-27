package tictacto;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.stage.Stage;

public class TikTaclosex extends Application {
        /**
        * @param args the command line arguments
        */


        public static void main(String[] args) {
        Application.launch(args);
        }
     
        public void start(Stage primaryStage) {
        Pane sp = new Pane();
                        
        primaryStage.setTitle("Load Image");
        ImageView imageView = new ImageView();
        ImageView imageView0 = new ImageView();
        ImageView imageView1 = new ImageView();
        ImageView imageView2 = new ImageView();
        Button playagain = new Button();
        Button savegame = new Button();
        Button exit = new Button();

        sp.setMaxHeight(USE_PREF_SIZE);
        sp.setMaxWidth(USE_PREF_SIZE);
        sp.setMinHeight(USE_PREF_SIZE);
        sp.setMinWidth(USE_PREF_SIZE);
        sp.setPrefHeight(352.0);
        sp.setPrefWidth(423.0);

        imageView.setFitHeight(352.0);
        imageView.setFitWidth(422.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("finalscreen2.png").toExternalForm()));

        imageView0.setFitHeight(246.0);
        imageView0.setFitWidth(102.0);
        imageView0.setLayoutX(23.0);
        imageView0.setLayoutY(18.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setRotate(-15.0);
        imageView0.setImage(new Image(getClass().getResource("Exclamation-mark-1-animated.gif").toExternalForm()));

        imageView1.setFitHeight(130.0);
        imageView1.setFitWidth(194.0);
        imageView1.setLayoutX(184.0);
        imageView1.setLayoutY(76.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("loses.png").toExternalForm()));

        imageView2.setFitHeight(61.0);
        imageView2.setFitWidth(63.0);
        imageView2.setLayoutX(124.0);
        imageView2.setLayoutY(102.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("x.png").toExternalForm()));

        playagain.setLayoutX(14.0);
        playagain.setLayoutY(269.0);
        playagain.setMnemonicParsing(false);
        playagain.setOpacity(0.0);
        playagain.setPrefHeight(34.0);
        playagain.setPrefWidth(121.0);
        playagain.setText("Button");
        playagain.setOnAction((ActionEvent event) -> {
            System.out.println("back");
            TicTak2 root1 = new TicTak2(primaryStage);
            Scene scene1 = new Scene(root1, 422, 350);
            primaryStage.setTitle("TicTacToe");
            primaryStage.setScene(scene1);
            primaryStage.show();
            
        }); 
        savegame.setLayoutX(151.0);
        savegame.setLayoutY(269.0);
        savegame.setMnemonicParsing(false);
        savegame.setOpacity(0.0);
        savegame.setPrefHeight(34.0);
        savegame.setPrefWidth(121.0);
        savegame.setText("Button");

        exit.setLayoutX(288.0);
        exit.setLayoutY(269.0);
        exit.setMnemonicParsing(false);
        exit.setOpacity(0.0);
        exit.setPrefHeight(34.0);
        exit.setPrefWidth(121.0);
        exit.setText("Button");
        exit.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) { 
          System.out.println("exitpressed");
           System.exit(0);    
      }
      }); 


        sp.getChildren().add(imageView);
        sp.getChildren().add(imageView0);
        sp.getChildren().add(imageView1);
        sp.getChildren().add(imageView2);
        sp.getChildren().add(playagain);
        sp.getChildren().add(savegame);
        sp.getChildren().add(exit);
        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
