package tictacto;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.stage.Stage;

public class TicTak8 extends Pane {

    protected final ImageView imageView;
    protected final Button connect;
    protected final Button back;
    protected final TextField textField;
    public Socket s ;
     public boolean validatedIPAddress(String ip){
        String[] t = ip.split("\\.");
        if(t.length != 4){
            return false ;
        }
        for(String str : t){
            int i = Integer.parseInt(str);
            if((i<0)||(i>255)){
                return false ;
            }
        }
        return true;
    }

    public TicTak8(Stage Stage8) {

        imageView = new ImageView();
        connect = new Button();
        back = new Button();
        textField = new TextField();
        
        
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
        imageView.setImage(new Image(getClass().getResource("network3.png").toExternalForm()));

        connect.setLayoutX(138.0);
        connect.setLayoutY(233.0);
        connect.setMnemonicParsing(false);
        connect.setOpacity(0.0);
        connect.setPrefHeight(38.0);
        connect.setPrefWidth(71.0);
        connect.setText("Button");
        connect.setOnAction(event -> {
             String ip = textField.getText();
          if(validatedIPAddress(ip)== true){
              System.out.println("connect");
               
                  try {
                      s =new Socket("172.16.5.212", 5001);
                  } catch (IOException ex) {
                      Logger.getLogger(TicTak3.class.getName()).log(Level.SEVERE, null, ex);
                  }
                  finally{
                  Networkp1p2 root1 = new Networkp1p2(Stage8, s);
                  Scene scene = new Scene(root1, 422, 350);
                  Stage8.setTitle("TicTacToe");
                  Stage8.setScene(scene);
                  Stage8.show();
                  }
          }
          else{
              //alerrrrrrrrrtttttt
          }

        });
        
       
        
        back.setLayoutX(223.0);
        back.setLayoutY(233.0);
        back.setMnemonicParsing(false);
        back.setOpacity(0.0);
        back.setPrefHeight(38.0);
        back.setPrefWidth(71.0);
        back.setText("Button");
        back.setOnAction(event -> {
            System.out.println("back");
             TicTak6 root1 = new TicTak6(Stage8);
                 Scene scene = new Scene(root1, 422, 350);

          Stage8.setTitle("TicTacToe");
          Stage8.setScene(scene);
          Stage8.show();


        });
        textField.setLayoutX(140.0);
        textField.setLayoutY(161.0);
        textField.setPrefHeight(29.0);
        textField.setPrefWidth(153.0);

        getChildren().add(imageView);
        getChildren().add(connect);
        getChildren().add(back);
        getChildren().add(textField);

    }
}
