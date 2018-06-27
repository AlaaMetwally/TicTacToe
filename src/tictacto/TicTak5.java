package tictacto;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public  class TicTak5 extends Pane {

    protected final ImageView imageView;
    protected final Button ok;
    protected final TextField textField;
    String name;
    public TicTak5(Stage Stage5) {
        
        imageView = new ImageView();
        ok = new Button();
        textField = new TextField();
         
     

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(351.0);
        setPrefWidth(423.0);

        imageView.setFitHeight(352.0);
        imageView.setFitWidth(423.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("player2screen.png").toExternalForm()));

        ok.setLayoutX(185.0);
        ok.setLayoutY(246.0);
        ok.setMnemonicParsing(false);
        ok.setOpacity(0.0);
        ok.setPrefHeight(41.0);
        ok.setPrefWidth(61.0);
        ok.setText("Button");
        ok.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) { 
          System.out.println("okpressed");
           p1vsp2selectplayer root1 = new p1vsp2selectplayer(Stage5);
               Scene scene = new Scene(root1, 422, 350);
        
        Stage5.setTitle("TicTacToe");
        Stage5.setScene(scene);
        Stage5.show();
           
      }
      }); 

        textField.setLayoutX(141.0);
        textField.setLayoutY(170.0);
        textField.setOpacity(0.51);
        textField.setPickOnBounds(false);
        textField.setPrefHeight(27.0);
        textField.setPrefWidth(152.0);
        textField.setFont(Font.font("arial", FontWeight.BOLD, 13));
        textField.setOpaqueInsets(new Insets(0.0));
        textField.setStyle("-fx-focus-color: transparent;");
        name=textField.getText();
        

        
    
        
        getChildren().add(imageView);
        getChildren().add(ok);
        getChildren().add(textField);

    }

}
