package tictacto;

import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public abstract class FXML4Base extends Pane {

    protected final ImageView imageView;
    protected final Button button;
    protected final Button button0;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final ImageView imageView0;

    public FXML4Base() {

        imageView = new ImageView();
        button = new Button();
        button0 = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        imageView0 = new ImageView();

        setMaxHeight(355.0);
        setMaxWidth(426.0);
        setMinHeight(321.0);
        setMinWidth(420.0);
        setPrefHeight(351.0);
        setPrefWidth(421.0);

        imageView.setFitHeight(352.0);
        imageView.setFitWidth(422.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("gameframe.png").toExternalForm()));

        button.setLayoutX(21.0);
        button.setLayoutY(257.0);
        button.setMnemonicParsing(false);
        button.setOpacity(0.0);
        button.setPrefHeight(33.0);
        button.setPrefWidth(67.0);
        button.setText("Button");

        button0.setLayoutX(343.0);
        button0.setLayoutY(253.0);
        button0.setMnemonicParsing(false);
        button0.setOpacity(0.0);
        button0.setPrefHeight(33.0);
        button0.setPrefWidth(67.0);
        button0.setText("Button");

        button1.setLayoutX(111.0);
        button1.setLayoutY(93.0);
        button1.setMnemonicParsing(false);
        button1.setOpacity(0.0);
        button1.setPrefHeight(55.0);
        button1.setPrefWidth(52.0);
        button1.setText("Button");

        button2.setLayoutX(176.0);
        button2.setLayoutY(93.0);
        button2.setMnemonicParsing(false);
        button2.setOpacity(0.0);
        button2.setPrefHeight(55.0);
        button2.setPrefWidth(67.0);
        button2.setText("Button");

        button3.setLayoutX(258.0);
        button3.setLayoutY(93.0);
        button3.setMnemonicParsing(false);
        button3.setOpacity(0.0);
        button3.setPrefHeight(55.0);
        button3.setPrefWidth(60.0);
        button3.setText("Button");

        button4.setLayoutX(111.0);
        button4.setLayoutY(155.0);
        button4.setMnemonicParsing(false);
        button4.setOpacity(0.0);
        button4.setPrefHeight(69.0);
        button4.setPrefWidth(52.0);
        button4.setText("Button");

        button5.setLayoutX(176.0);
        button5.setLayoutY(155.0);
        button5.setMnemonicParsing(false);
        button5.setOpacity(0.0);
        button5.setPrefHeight(69.0);
        button5.setPrefWidth(67.0);
        button5.setText("Button");

        button6.setLayoutX(255.0);
        button6.setLayoutY(160.0);
        button6.setMnemonicParsing(false);
        button6.setOpacity(0.0);
        button6.setPrefHeight(62.0);
        button6.setPrefWidth(60.0);
        button6.setText("Button");

        button7.setLayoutX(103.0);
        button7.setLayoutY(236.0);
        button7.setMnemonicParsing(false);
        button7.setOpacity(0.0);
        button7.setPrefHeight(55.0);
        button7.setPrefWidth(60.0);
        button7.setText("Button");

        button8.setLayoutX(176.0);
        button8.setLayoutY(236.0);
        button8.setMnemonicParsing(false);
        button8.setOpacity(0.0);
        button8.setPrefHeight(55.0);
        button8.setPrefWidth(67.0);
        button8.setText("Button");

        button9.setLayoutX(254.0);
        button9.setLayoutY(235.0);
        button9.setMnemonicParsing(false);
        button9.setOpacity(0.0);
        button9.setPrefHeight(55.0);
        button9.setPrefWidth(60.0);
        button9.setText("Button");

        imageView0.setFitHeight(351.0);
        imageView0.setFitWidth(421.0);
        imageView0.setLayoutX(3.0);
        imageView0.setLayoutY(2.0);
        imageView0.setImage(new Image(getClass().getResource("1179514.gif").toExternalForm()));

        getChildren().add(imageView);
        getChildren().add(button);
        getChildren().add(button0);
        getChildren().add(button1);
        getChildren().add(button2);
        getChildren().add(button3);
        getChildren().add(button4);
        getChildren().add(button5);
        getChildren().add(button6);
        getChildren().add(button7);
        getChildren().add(button8);
        getChildren().add(button9);
        getChildren().add(imageView0);

    }
}
