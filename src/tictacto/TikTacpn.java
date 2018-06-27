package tictacto;

import java.awt.image.RescaleOp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static tictacto.TicTak.conn;

public class TikTacpn extends Pane {

    protected final ImageView imageView;
    protected final Button prev;
    protected final Button next;
    protected final Button back;
    protected Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final Button button10;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final Text text6;
    protected final Text text7;
    protected final Text text8;
    protected final Text text9;
    public int symbol_id;
    public int place;
    public int sid;
    public ResultSet r;
    public ResultSet rs;
    public ResultSet result;
    public int gid;

    public TikTacpn(Stage stagepn) {

        imageView = new ImageView();
        prev = new Button();
        next = new Button();
        back = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        button10 = new Button();
        text1 = new Text();
        text2 = new Text();
        text3 = new Text();
        text4 = new Text();
        text5 = new Text();
        text6 = new Text();
        text7 = new Text();
        text8 = new Text();
        text9 = new Text();
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
        imageView.setImage(new Image(getClass().getResource("playbackpn.png").toExternalForm()));

        prev.setLayoutX(21.0);
        prev.setLayoutY(222.0);
        prev.setMnemonicParsing(false);
        prev.setOpacity(0.0);
        prev.setPrefHeight(26.0);
        prev.setPrefWidth(67.0);
        prev.setText("Button");

        next.setLayoutX(21.0);
        next.setLayoutY(257.0);
        next.setMnemonicParsing(false);
        next.setOpacity(0.0);
        next.setPrefHeight(33.0);
        next.setPrefWidth(67.0);
        next.setText("Button");
        try {
            String queryString;
            queryString = "select Max(game_id) from saved_game ";
            Statement statement = conn.createStatement();
            rs = statement.executeQuery(queryString);

            gid = rs.getInt(1);

          //  queryString = "select place_id from video where game_id=" + gid + " ";
           // statement = conn.createStatement();
            //result = statement.executeQuery(queryString);

            queryString = "select symbol_id ,place_id from video where game_id=" + gid + "";
            statement = conn.createStatement();
            r = statement.executeQuery(queryString);
        } catch (SQLException sq) {

        }
        next.setOnAction(new EventHandler<ActionEvent>() {
            @Override

            public void handle(ActionEvent event) {

                try {
                    if (r.next()) {
                        place = r.getInt(2);

                        sid = r.getInt(1);

                        System.out.println("symbol nd gid" + sid + " " + gid);
                        if (place == 1) {

                            if (sid == 1) {
                                text1.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text1.setX(111.0);
                                text1.setY(140.0);
                                text1.setText("X");
                                text1.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                System.out.println("Youstina");
                                text1.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text1.setX(111.0);
                                text1.setY(140.0);
                                text1.setText("O");
                                text1.setFill(Color.web("#d3711d"));
                            }

                        } else if (place == 2) {
                            if (sid == 1) {

                                text2.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text2.setX(185.0);
                                text2.setY(140.0);
                                text2.setText("X");
                                text2.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text2.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text2.setX(185.0);
                                text2.setY(140.0);
                                text2.setText("O");
                                text2.setFill(Color.web("#d3711d"));
                            }

                        } else if (place == 3) {
                            if (sid == 1) {

                                text3.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text3.setX(259.0);
                                text3.setY(140.0);
                                text3.setText("X");
                                text3.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text3.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text3.setX(259.0);
                                text3.setY(140.0);
                                text3.setText("O");
                                text3.setFill(Color.web("#d3711d"));
                            }
                        } else if (place == 4) {
                            if (sid == 1) {

                                text4.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text4.setX(111.0);
                                text4.setY(210.0);
                                text4.setText("X");
                                text4.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text4.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text4.setX(111.0);
                                text4.setY(210.0);
                                text4.setText("O");
                                text4.setFill(Color.web("#d3711d"));
                            }

                        } else if (place == 5) {
                            if (sid == 1) {

                                text5.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text5.setX(185.0);
                                text5.setY(210.0);
                                text5.setText("X");
                                text5.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text5.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text5.setX(185.0);
                                text5.setY(210.0);
                                text5.setText("O");
                                text5.setFill(Color.web("#d3711d"));
                            }

                        } else if (place == 6) {
                            if (sid == 1) {

                                text6.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text6.setX(260.0);
                                text6.setY(210.0);
                                text6.setText("X");
                                text6.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text6.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text6.setX(260.0);
                                text6.setY(210.0);
                                text6.setText("O");
                                text6.setFill(Color.web("#d3711d"));
                            }

                        } else if (place == 7) {

                            if (sid == 1) {

                                text7.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text7.setX(111.0);
                                text7.setY(285.0);
                                text7.setText("X");
                                text7.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text7.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text7.setX(111.0);
                                text7.setY(285.0);
                                text7.setText("O");
                                text7.setFill(Color.web("#d3711d"));
                            }

                        } else if (place == 8) {
                            if (sid == 1) {
                                text8.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text8.setX(185.0);
                                text8.setY(285.0);
                                text8.setText("X");
                                text8.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text8.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text8.setX(185.0);
                                text8.setY(285.0);
                                text8.setText("O");
                                text8.setFill(Color.web("#d3711d"));
                            }

                        } else if (place == 9) {
                            if (sid == 1) {

                                text9.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text9.setX(259.0);
                                text9.setY(285.0);
                                text9.setText("X");
                                text9.setFill(Color.web("#d3711d"));
                            } else if (sid == 2) {
                                text9.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                                text9.setX(259.0);
                                text9.setY(285.0);
                                text9.setText("O");
                                text9.setFill(Color.web("#d3711d"));
                            }
                        }
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TikTacpn.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });

        back.setLayoutX(343.0);
        back.setLayoutY(253.0);
        back.setMnemonicParsing(false);
        back.setOpacity(0.0);
        back.setPrefHeight(33.0);
        back.setPrefWidth(67.0);
        back.setText("Button");
        back.setOnAction((ActionEvent event) -> {
            System.out.println("back");
            TicTak2 root1 = new TicTak2(stagepn);
            Scene scene1 = new Scene(root1, 422, 350);
            stagepn.setTitle("TicTacToe");
            stagepn.setScene(scene1);
            stagepn.show();
        }); 
        
        button2.setLayoutX(111.0);
        button2.setLayoutY(93.0);
        button2.setMnemonicParsing(false);
        button2.setOpacity(0.0);
        button2.setPrefHeight(55.0);
        button2.setPrefWidth(52.0);
        button2.setText("Button");

        button3.setLayoutX(176.0);
        button3.setLayoutY(93.0);
        button3.setMnemonicParsing(false);
        button3.setOpacity(0.0);
        button3.setPrefHeight(55.0);
        button3.setPrefWidth(67.0);
        button3.setText("Button");

        button4.setLayoutX(258.0);
        button4.setLayoutY(93.0);
        button4.setMnemonicParsing(false);
        button4.setOpacity(0.0);
        button4.setPrefHeight(55.0);
        button4.setPrefWidth(60.0);
        button4.setText("Button");

        button5.setLayoutX(111.0);
        button5.setLayoutY(155.0);
        button5.setMnemonicParsing(false);
        button5.setOpacity(0.0);
        button5.setPrefHeight(69.0);
        button5.setPrefWidth(52.0);
        button5.setText("Button");

        button6.setLayoutX(176.0);
        button6.setLayoutY(155.0);
        button6.setMnemonicParsing(false);
        button6.setOpacity(0.0);
        button6.setPrefHeight(69.0);
        button6.setPrefWidth(67.0);
        button6.setText("Button");

        button7.setLayoutX(255.0);
        button7.setLayoutY(160.0);
        button7.setMnemonicParsing(false);
        button7.setOpacity(0.0);
        button7.setPrefHeight(62.0);
        button7.setPrefWidth(60.0);
        button7.setText("Button");

        button8.setLayoutX(103.0);
        button8.setLayoutY(236.0);
        button8.setMnemonicParsing(false);
        button8.setOpacity(0.0);
        button8.setPrefHeight(55.0);
        button8.setPrefWidth(60.0);
        button8.setText("Button");

        button9.setLayoutX(176.0);
        button9.setLayoutY(236.0);
        button9.setMnemonicParsing(false);
        button9.setOpacity(0.0);
        button9.setPrefHeight(55.0);
        button9.setPrefWidth(67.0);
        button9.setText("Button");

        button10.setLayoutX(254.0);
        button10.setLayoutY(235.0);
        button10.setMnemonicParsing(false);
        button10.setOpacity(0.0);
        button10.setPrefHeight(55.0);
        button10.setPrefWidth(60.0);
        button10.setText("Button");

        getChildren().add(imageView);
        getChildren().add(prev);
        getChildren().add(next);
        getChildren().add(back);
        getChildren().add(button2);
        getChildren().add(button3);
        getChildren().add(button4);
        getChildren().add(button5);
        getChildren().add(button6);
        getChildren().add(button7);
        getChildren().add(button8);
        getChildren().add(button9);
        getChildren().add(button10);
        getChildren().add(text1);
        getChildren().add(text2);
        getChildren().add(text3);
        getChildren().add(text4);
        getChildren().add(text5);
        getChildren().add(text6);
        getChildren().add(text7);
        getChildren().add(text8);
        getChildren().add(text9);
    }
}
