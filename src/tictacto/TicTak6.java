package tictacto;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TicTak6 extends Pane {

    protected final ImageView imageView;
    protected final Button guest;
    protected final Button host;
    protected final Button back;

    public TicTak6(Stage Stage6) {

        imageView = new ImageView();
        guest = new Button();
        host = new Button();
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
        imageView.setImage(new Image(getClass().getResource("network1.png").toExternalForm()));

        guest.setLayoutX(158.0);
        guest.setLayoutY(163.0);
        guest.setMnemonicParsing(false);
        guest.setOpacity(0.0);
        guest.setPrefHeight(35.0);
        guest.setPrefWidth(119.0);
        guest.setText("Button");
        guest.setOnAction(event -> {
            System.out.println("guest");
            TicTak8 root1 = new TicTak8(Stage6);
            Scene scene = new Scene(root1, 422, 350);

            Stage6.setTitle("TicTacToe");
            Stage6.setScene(scene);
            Stage6.show();

        });

        host.setLayoutX(158.0);
        host.setLayoutY(105.0);
        host.setMnemonicParsing(false);
        host.setOpacity(0.0);
        host.setPrefHeight(35.0);
        host.setPrefWidth(119.0);
        host.setText("Button");
        host.setOnAction(event -> {
            System.out.println("host");
            NetworkSelect root1 = new NetworkSelect(Stage6);
            Scene scene = new Scene(root1, 422, 350);

            Stage6.setTitle("TicTacToe");
            Stage6.setScene(scene);
            Stage6.show();

        });
        back.setLayoutX(158.0);
        back.setLayoutY(221.0);
        back.setMnemonicParsing(false);
        back.setOpacity(0.0);
        back.setPrefHeight(35.0);
        back.setPrefWidth(119.0);
        back.setText("Button");
        back.setOnAction(event -> {
            System.out.println("back");
            TicTak2 root1 = new TicTak2(Stage6);
            Scene scene = new Scene(root1, 422, 350);

            Stage6.setTitle("TicTacToe");
            Stage6.setScene(scene);
            Stage6.show();
        });

        getChildren().add(imageView);
        getChildren().add(guest);
        getChildren().add(host);
        getChildren().add(back);

    }
}
