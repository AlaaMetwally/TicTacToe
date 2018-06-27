/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 
import java.util.logging.Level;
import java.util.logging.Logger;
import static tictacto.TicTak.conn;
/**
 *
 * @author alaa
 */
public class Game  {
    int game_id;
    TicTak3 tic;
  Game() {
   
try{
            PreparedStatement stmt = conn.prepareStatement
            ("insert into games (game_status) values(?)");
 
            stmt.setString(1, "start");
            stmt.executeUpdate();
            this.game_id=this.getGameId();
        } catch (SQLException ex) {
            System.out.println("in game class startNewGame");
        }
       /* finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }*/

    }
  public int getId()
  {
     return this.game_id; 
  }
  private  int getGameId() {
        try {
            String queryString = "select MAX(ID) as maxid from games";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(queryString) ;
            
            game_id=rs.getInt("maxid");
        
        } catch (SQLException ex) {
           // Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("in game class getGameId");
        }
      return game_id;
  }
  public void endGame()
  { 
        try {
            
            String queryinsert ="update games set game_status = ? where ID = ? ";
            PreparedStatement pst = conn.prepareStatement(queryinsert);      
            pst.setInt(2,this.game_id);
            pst.setString(1,"close");
            pst.executeUpdate();      
            }catch (SQLException ex) {
            //Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("in game class endGame");
        }
  }
  
  
  public void winGame(int player_id)
  {
        try {
            String queryinsert ="update games set game_status = ?,winner = ? where ID = ? ";
            PreparedStatement pst = conn.prepareStatement(queryinsert);
            pst.setString(1,"close");
            pst.setInt(2,player_id);
            pst.setInt(3,this.game_id);
            pst.executeUpdate();   
        } catch (SQLException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
  }
     /**
     * @param args the command line arguments
     */
    
     /* public static void main(String[] args) {
 
    
       /* g.joinGame(1, 10);
        g.winGame(15);
        System.out.print(g.game_id);
        g.endGame();
 
    }*/

    /**
     *
     * @param p1
     * @param args the command line arguments
     */

    /**
     *
     * @param p1
     * @param p2
     * @param args the command line arguments
     */
    public void joinGame(Player p1,Player p2) {
         String queryinsert ="update games set firstplayer_id = ?, secondplayer_id=? where ID = ? ";
            PreparedStatement pst;
        try {
            pst = conn.prepareStatement(queryinsert);
            pst.setInt(1,p1.player_id);
            pst.setInt(2,p2.player_id);
            pst.setInt(3,this.game_id);
            pst.executeUpdate();
            
            p1.game_id=this.game_id;
            p2.game_id=this.game_id;
        } catch (SQLException ex) {
            //Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("in game class joinGame");
        }
    }
    
    public void joinGame(Player p1,Com_player p2) {
         String queryinsert ="update games set firstplayer_id = ?, secondplayer_id=? where ID = ? ";
            PreparedStatement pst;
        try {
            pst = conn.prepareStatement(queryinsert);
            pst.setInt(1,p1.player_id);
            pst.setInt(2,p2.player_id);
            pst.setInt(3,this.game_id);
            pst.executeUpdate();
            
            p1.game_id=this.game_id;
            p2.game_id=this.game_id;
        } catch (SQLException ex) {
            //Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("in game class joinGame");
        }
    }

}

    
