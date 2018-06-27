package tictacto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import static tictacto.TicTak.conn;




public  class TicTak3 extends Pane {


    public TicTak3 tic; 
    public final ImageView imageView;
    public final Button x;
    public final Button o;
    public final Button ok;
    public int o_id;
    public int x_id;
    Statement statement;
    public static int symbol_id;
    public Player p1=new Player(1);
    public Player p2;
    public Game g=new Game();
    public Com_player c=new Com_player(1);
    public static int game_id;
    
    /**
     *
     * @param Stage3
     */
    public TicTak3(Stage Stage3){
          // db parameters

    // create a connection to the database   
        imageView = new ImageView();
        x = new Button();
        o = new Button();
        ok = new Button();
        
        setMaxHeight(USE_PREF_SIZE);
        setMaxWidth(USE_PREF_SIZE);
        setMinHeight(USE_PREF_SIZE);
        setMinWidth(USE_PREF_SIZE);
        setPrefHeight(351.0);
        setPrefWidth(422.0);

        imageView.setFitHeight(352.0);
        imageView.setFitWidth(422.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("selectplayer.png").toExternalForm()));

        x.setLayoutX(124.0);
        x.setLayoutY(132.0);
        x.setMnemonicParsing(false);
        x.setOpacity(0.0);
        x.setPrefHeight(100.0);
        x.setPrefWidth(73.0);
        x.setText("Button");
        
       
        this.g.joinGame(p1, c);

        x.setOnAction(new EventHandler<ActionEvent>() {
         
      @Override public void handle(ActionEvent event) { 
                
                try {
                
                String queryString = "select ID  from xo_symbol where symbol='x'";
                statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(queryString) ;
                x_id=rs.getInt("ID");
                symbol_id=x_id;
                o_id=2;
            } catch (SQLException ex) {
                System.out.println("in tictak3 class setaction on x");
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                
            }   
       
      }
      }); 

        o.setLayoutX(228.0);
        o.setLayoutY(132.0);
        o.setMnemonicParsing(false);
        o.setOpacity(0.0);
        o.setPrefHeight(100.0);
        o.setPrefWidth(83.0);
        o.setText("Button");
        o.setOnAction(new EventHandler<ActionEvent>() {
           
        @Override 
        public void handle(ActionEvent event) { 
       try {
                String queryString = "select ID  from xo_symbol where symbol='o'";
                statement = conn.createStatement();
                ResultSet rs = statement.executeQuery(queryString) ;
                o_id=rs.getInt("ID");
                symbol_id=o_id;
                x_id=1;
            } catch (SQLException ex) {
                System.out.println("in tictak3 class setaction on o");
                Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
                
            }  
   
           
      }
      }); 

        ok.setLayoutX(183.0);
        ok.setLayoutY(246.0);
        ok.setMnemonicParsing(false);
        ok.setOpacity(0.0);
        ok.setPrefHeight(39.0);
        ok.setPrefWidth(64.0);
        ok.setText("Button");
        ok.setOnAction(new EventHandler<ActionEvent>() {
      @Override public void handle(ActionEvent event) {           
           System.out.println("ok");
           
        TicTak4 root1 = new TicTak4 (Stage3);
        getIdSymbol();
        
           Scene scene = new Scene(root1, 422, 350);
         
        Stage3.setTitle("TicTacToe");
        Stage3.setScene(scene);
        Stage3.show();
      }
      });   
        getChildren().add(imageView);
        getChildren().add(x);
        getChildren().add(o);
        getChildren().add(ok);
     
    }

   
    

    public int getIdSymbol()
    {
       System.out.println(symbol_id);
         if(symbol_id==1)
        {
        System.out.println(symbol_id);
        
            System.out.println("c_id====>"+this.c.player_id+"hId===>"+this.p1.player_id);
        p1.symbol_id=this.x_id;
        c.symbol_id=this.o_id;
        }
        else if(symbol_id==2)
        {
         
        p1.symbol_id=this.o_id;
        c.symbol_id=this.x_id;

        }
         return symbol_id;
    }
    public static ArrayList playback()
    {
        
        try{
            ArrayList places=new ArrayList();
            String queryString = "select place_id  from players_moves where game_id="+game_id+"";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(queryString) ;
            int i=0;
            while(rs.next())
            {
                places.add(rs.getInt("place_id"));
                 PreparedStatement stmt = conn.prepareStatement
            ("insert into video (place_id) values(?)");
            stmt.setInt(1, (int) places.get(i));  
            i++;
            stmt.executeUpdate();
            }
            
             System.out.println(places);

        } catch (SQLException ex) {
           Logger.getLogger(TicTak3.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("in places class TicTak3");
        
        }
    return null;
    }
}