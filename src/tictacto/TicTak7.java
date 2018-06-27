package tictacto;

import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import static javafx.scene.layout.Region.USE_PREF_SIZE;
import javafx.stage.Stage;

//button el back b2a connect *-*
public class TicTak7 extends Pane {

    protected final ImageView imageView;
    protected final Button connect;
    protected final Label label;
    public Socket s ;
    public ServerSocket serverSocket;
    

    public TicTak7(Stage Stage7) {

        imageView = new ImageView();
        connect = new Button();
        label = new Label();

        label.setText("172.16.5.212");

        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(352.0);
        setPrefWidth(422.0);

        imageView.setFitHeight(352.0);
        imageView.setFitWidth(422.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("network2.png").toExternalForm()));

        connect.setLayoutX(181.0);
        connect.setLayoutY(236.0);
        connect.setMnemonicParsing(false);
        connect.setOpacity(0.0);
        connect.setPrefHeight(34.0);
        connect.setPrefWidth(75.0);
        connect.setText("Button");
        connect.setOnAction(event -> {
            System.out.println("connect");
            try {
              serverSocket  = new ServerSocket(5001);
                s = serverSocket.accept();
            } catch (IOException ex) {
                Logger.getLogger(TicTak7.class.getName()).log(Level.SEVERE, null, ex);
            }
          
            Networkp1p2 root1 = new Networkp1p2(Stage7, s);
            Scene scene = new Scene(root1, 422, 350);

            Stage7.setTitle("TicTacToe");
            Stage7.setScene(scene);
            Stage7.show();
            

        });
        label.setLayoutX(140.0);
        label.setLayoutY(162.0);
        label.setPrefHeight(27.0);
        label.setPrefWidth(156.0);

        getChildren().add(imageView);
        getChildren().add(connect);
        getChildren().add(label);

    }
}
