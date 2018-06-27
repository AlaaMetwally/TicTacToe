package tictacto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import static tictacto.TicTak.conn;
/**
*
* @author zoranpavlovic.blogspot.com
*/
public class TicTakwino extends Application {
        /**
        * @param args the command line arguments
        */
        public int game;

        public static void main(String[] args) {
        Application.launch(args);
        }
        @Override
        public void start(Stage primaryStage) {
        Pane sp = new Pane();
                        
        primaryStage.setTitle("Load Image");
        ImageView imageView = new ImageView();
        ImageView imageView0 = new ImageView();
        ImageView imageView1 = new ImageView();
        ImageView imageView2 = new ImageView();
        ImageView imageView3 = new ImageView();
        ImageView imageView4 = new ImageView();
        ImageView imageView5 = new ImageView();
        ImageView imageView6 = new ImageView();
        Button playagain = new Button();
        Button savegame = new Button();
        Button back = new Button();
      
        sp.setMaxHeight(USE_PREF_SIZE);
        sp.setMaxWidth(USE_PREF_SIZE);
        sp.setMinHeight(USE_PREF_SIZE);
        sp.setMinWidth(USE_PREF_SIZE);
        sp.setPrefHeight(352.0);
        sp.setPrefWidth(423.0);
        
        imageView.setFitHeight(352.0);
        imageView.setFitWidth(500.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("finalscreen2.png").toExternalForm()));

        imageView0.setFitHeight(150.0);
        imageView0.setFitWidth(200.0);
        imageView0.setPickOnBounds(true);
        imageView0.setPreserveRatio(true);
        imageView0.setImage(new Image(getClass().getResource("1179514.gif").toExternalForm()));

        imageView1.setFitHeight(150.0);
        imageView1.setFitWidth(200.0);
        imageView1.setLayoutX(268.0);
        imageView1.setLayoutY(150.0);
        imageView1.setPickOnBounds(true);
        imageView1.setPreserveRatio(true);
        imageView1.setImage(new Image(getClass().getResource("1179514.gif").toExternalForm()));

        imageView2.setFitHeight(49.0);
        imageView2.setFitWidth(50.0);
        imageView2.setLayoutX(117.0);
        imageView2.setLayoutY(126.0);
        imageView2.setPickOnBounds(true);
        imageView2.setPreserveRatio(true);
        imageView2.setImage(new Image(getClass().getResource("o.png").toExternalForm()));

        imageView3.setFitHeight(111.0);
        imageView3.setFitWidth(140.0);
        imageView3.setLayoutX(175.0);
        imageView3.setLayoutY(96.0);
        imageView3.setPickOnBounds(true);
        imageView3.setPreserveRatio(true);
        imageView3.setImage(new Image(getClass().getResource("wins.png").toExternalForm()));

        imageView4.setFitHeight(150.0);
        imageView4.setFitWidth(200.0);
        imageView4.setLayoutX(-6.0);
        imageView4.setLayoutY(150.0);
        imageView4.setPickOnBounds(true);
        imageView4.setPreserveRatio(true);
        imageView4.setImage(new Image(getClass().getResource("1179514.gif").toExternalForm()));

        imageView5.setFitHeight(150.0);
        imageView5.setFitWidth(200.0);
        imageView5.setLayoutX(131.0);
        imageView5.setLayoutY(51.0);
        imageView5.setPickOnBounds(true);
        imageView5.setPreserveRatio(true);
        imageView5.setImage(new Image(getClass().getResource("1179514.gif").toExternalForm()));

        imageView6.setFitHeight(150.0);
        imageView6.setFitWidth(200.0);
        imageView6.setLayoutX(268.0);
        imageView6.setLayoutY(9.0);
        imageView6.setPickOnBounds(true);
        imageView6.setPreserveRatio(true);
        imageView6.setImage(new Image(getClass().getResource("1179514.gif").toExternalForm()));

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
       
        savegame.setOnAction((ActionEvent event) -> {
            System.out.println("save");
            try {
      Statement statement = conn.createStatement();      
      String queryString = "select MAX(ID) as maxid from games";
      ResultSet rs = statement.executeQuery(queryString) ;
            
           game=rs.getInt("maxid");
             PreparedStatement stmt = conn.prepareStatement
            ("insert into saved_game (game_id) values(?)");
 
            stmt.setInt(1, game);
            stmt.executeUpdate();
        } catch (SQLException ex) {
           // Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("in tictakwino class getGameId");
        }
            
        }); 
          
      

        back.setLayoutX(288.0);
        back.setLayoutY(269.0);
        back.setMnemonicParsing(false);
        back.setOpacity(0.0);
        back.setPrefHeight(34.0);
        back.setPrefWidth(121.0);
        back.setText("Button");
        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.exit(0);
            }
         });
        
        sp.getChildren().add(imageView);
        sp.getChildren().add(imageView0);
        sp.getChildren().add(imageView1);
        sp.getChildren().add(imageView2);
        sp.getChildren().add(imageView3);
        sp.getChildren().add(imageView4);
        sp.getChildren().add(imageView5);
        sp.getChildren().add(imageView6);
        sp.getChildren().add(playagain);
        sp.getChildren().add(savegame);
        sp.getChildren().add(back);
        //Adding HBox to the scene
        Scene scene = new Scene(sp);
        primaryStage.setScene(scene);
        primaryStage.show();
}
}
