
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public  class TikTactie extends Pane {

    protected final ImageView imageView;
    protected final ImageView imageView0;
    protected final ImageView imageView1;
    protected final Button playagain;
    protected final Button savegame;
    protected final Button exit;

    public TikTactie(Stage Stagetie) {

        imageView = new ImageView();
        imageView0 = new ImageView();
        imageView1 = new ImageView();
        playagain = new Button();
        savegame = new Button();
        exit = new Button();

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(352.0);
        setPrefWidth(423.0);

        imageView.setFitHeight(352.0);
        imageView.setFitWidth(422.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("finalscreen2.png").toExternalForm()));

        imageView0.setFitHeight(246.0);
        imageView0.setFitWidth(102.0);
        imageView0.setLayoutX(54.0);
        imageView0.setLayoutY(24.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setRotate(-15.0);
        imageView0.setImage(new Image(getClass().getResource("Exclamation-mark-1-animated.gif").toExternalForm()));

        imageView1.setFitHeight(205.0);
        imageView1.setFitWidth(267.0);
        imageView1.setLayoutX(101.0);
        imageView1.setLayoutY(59.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("tie.png").toExternalForm()));

        playagain.setLayoutX(14.0);
        playagain.setLayoutY(269.0);
        playagain.setMnemonicParsing(false);
        playagain.setOpacity(0.0);
        playagain.setPrefHeight(34.0);
        playagain.setPrefWidth(121.0);
        playagain.setText("Button");

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

        getChildren().add(imageView);
        getChildren().add(imageView0);
        getChildren().add(imageView1);
        getChildren().add(playagain);
        getChildren().add(savegame);
        getChildren().add(exit);

       
    }
}
