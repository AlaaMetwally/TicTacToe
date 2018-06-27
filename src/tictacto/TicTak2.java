package tictacto;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TicTak2 extends Pane {

    protected final ImageView imageView;
    protected final Button single;
    protected final Button multi;
    protected final Button network;
    protected final Button playback;
    protected final Button back;

    public TicTak2(Stage Stage2) {

        imageView = new ImageView();
        single = new Button();
        multi = new Button();
        network = new Button();
        playback = new Button();
        back = new Button();

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
        imageView.setImage(new Image(getClass().getResource("screen3.png").toExternalForm()));

        single.setLayoutX(158.0);
        single.setLayoutY(91.0);
        single.setMnemonicParsing(false);
        single.setOpacity(0.0);
        single.setPrefHeight(35.0);
        single.setPrefWidth(121.0);
        single.setText("Button");
        single.setOnAction((ActionEvent event) -> {
            System.out.println("single");
            TicTak3 root1 = new TicTak3(Stage2);
            Scene scene1 = new Scene(root1, 422, 350);
            Stage2.setTitle("TicTacToe");
            Stage2.setScene(scene1);
            Stage2.show();
        }); 
        
        
                
        multi.setLayoutX(157.0);
        multi.setLayoutY(130.0);
        multi.setMnemonicParsing(false);
        multi.setOpacity(0.0);
        multi.setPrefHeight(35.0);
        multi.setPrefWidth(121.0);
        multi.setText("Button");
        multi.setOnAction((ActionEvent event) -> {
            System.out.println("multi");
          /*  TicTak5 root2 =new TicTak5(Stage2);
           Scene scene2 = new Scene(root2, 422, 350);
        Stage2.setTitle("TicTacToe");
            Stage2.setScene(scene2);
            Stage2.show();*/
           
           
           
            p1vsp2selectplayer root1 = new p1vsp2selectplayer(Stage2);
            Scene scene1 = new Scene(root1, 422, 350);
            Stage2.setTitle("TicTacToe");
            Stage2.setScene(scene1);
            Stage2.show();
        }); 
        network.setLayoutX(157.0);
        network.setLayoutY(175.0);
        network.setMnemonicParsing(false);
        network.setOpacity(0.0);
        network.setPrefHeight(35.0);
        network.setPrefWidth(121.0);
        network.setText("Button");
        network.setOnAction((ActionEvent event) -> {
            System.out.println("network");
            
           TicTak6 root1 = new TicTak6(Stage2);
           Scene scene = new Scene(root1, 422, 350);
        
        Stage2.setTitle("TicTacToe");
        Stage2.setScene(scene);
        Stage2.show();
        }); 
        
        
        playback.setLayoutX(157.0);
        playback.setLayoutY(216.0);
        playback.setMnemonicParsing(false);
        playback.setOpacity(0.0);
        playback.setPrefHeight(35.0);
        playback.setPrefWidth(121.0);
        playback.setText("Button");
          playback.setOnAction((ActionEvent event) -> {
            System.out.println("playback");
              TikTacpn root1 = new TikTacpn(Stage2);
           Scene scene = new Scene(root1, 422, 350);
        
        Stage2.setTitle("TicTacToe");
        Stage2.setScene(scene);
        Stage2.show();
        }); 
        
        
        back.setLayoutX(158.0);
        back.setLayoutY(259.0);
        back.setMnemonicParsing(false);
        back.setOpacity(0.0);
        back.setPrefHeight(35.0);
        back.setPrefWidth(121.0);
        back.setText("Button");
        back.setOnAction((ActionEvent event) -> {
            System.out.println("back");
            TicTak root1 = new TicTak(Stage2);
            Scene scene1 = new Scene(root1, 422, 350);
            Stage2.setTitle("TicTacToe");
            Stage2.setScene(scene1);
            Stage2.show();
        }); 
        
        getChildren().add(imageView);
        getChildren().add(single);
        getChildren().add(multi);
        getChildren().add(network);
        getChildren().add(playback);
        getChildren().add(back);

    }
}
