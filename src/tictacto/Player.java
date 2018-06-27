/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacto;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import static tictacto.TicTak.conn;
/**
 *
 * @author alaa
 */
public class Player {
    public int pid;
    static int symbol_id;
    int player_id;
    int game_id;
   boolean ishuman;
    Player(int symbol_id) 
    {     
        try {
            System.out.println("then"+symbol_id );
            ishuman=true;
            PreparedStatement stmt = conn.prepareStatement("insert into players (symbol_id) values(?)");
            stmt.setInt(1, symbol_id);
            stmt.executeUpdate();        
            this.symbol_id=symbol_id;
            this.player_id=getPlayerId();
            System.out.println("what"+this.symbol_id);
        } catch (SQLException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("The error is in Player constructor");
        }
    }

  
    public int getPlayerId()//THIS IS USED JUST FOR ONE TIME ,DON'T USE IT AGAIN
    {
     try {
            String queryString = "select MAX(player_id) as maxid from players";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(queryString) ;
            
            player_id=rs.getInt("maxid");
        
        } catch (SQLException ex) {
           // Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("in player class getPlayerId");
        }
      return player_id;
    }
    
    public void play(int place_id)
    {
        try {
            
           
            System.out.println("game id"+this.game_id);
            PreparedStatement stmt = conn.prepareStatement
                            ("insert into players_moves (game_id,player_id,place_id) values(?,?,?)");
            stmt.setInt(1,this.game_id);
            stmt.setInt(2,this.player_id);
            stmt.setInt(3, place_id);


            stmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }   
             try
             {        
                    if(this.symbol_id==1)
            {
                pid=2;
            }
            else
            {
                pid=1;
            }
            PreparedStatement statement = conn.prepareStatement
            ("insert into video(game_id,symbol_id,player_id,place_id) values(?,?,?,?)");
            statement.setInt(1,game_id);
            statement.setInt(2,pid);
            statement.setInt(3,player_id);
            statement.setInt(4,place_id);
          
            statement.executeUpdate();
    }
           catch (SQLException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
    public boolean checkWin()
    {
          int[][] placeArr;
          placeArr = new int[8][3];
           try {
            String queryString = "select place1,place2,place3 from win_situation ";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(queryString) ;
         
              for(int i=0;i<8;i++)
              {
                  rs.next();
                  for(int j=1;j<4;j++)
                  {
              placeArr[i][0]=rs.getInt("place1");
              placeArr[i][j++]=rs.getInt("place2");
              placeArr[i][j++]=rs.getInt("place3");
            }
            }
            //System.out.print(Arrays.deepToString(placeArr));
            //Movement places of the player
           ArrayList playerPlaces = getPlayerPlaces(); 
           int[] one_situation;
            Boolean winning=false;
              for (int[] placeArr1 : placeArr) {
                  one_situation = placeArr1;
                  if(check_played(one_situation[0])&&check_played(one_situation[1])&&check_played(one_situation[2]))
                  {
                      winning=true;
                      break;
                  }
              }
             return winning;
           }
           catch (SQLException ex) {
           // Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("in player class checkWin");
        }
                      return false;
    }
    private boolean check_played(int place_id)
    {
        ArrayList played_arr=getPlayerPlaces();
        int i;
        
        for (i=0;i<played_arr.size();i++)
        {
            if(place_id==(int)played_arr.get(i))
            {
                return true;   
            }
        }
        return false;
    }
    ArrayList getPlayerPlaces()
    {
         ArrayList playerPlaces = new ArrayList();
           try {
            String queryString = "select place_id from players_moves where game_id="+this.game_id+" and player_id="+this.player_id+"";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(queryString) ;
            while(rs.next())
            {
              playerPlaces.add(rs.getInt("place_id"));
            }
        } catch (SQLException ex) {
           // Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
           System.out.println("in player class getPlayerPlaces");
        }
        return playerPlaces;
    }
 public static void main (String[] args )
      {
      String url = "jdbc:sqlite:tictacto";
          try {
              conn = DriverManager.getConnection(url);
          } catch (SQLException ex) {
              Logger.getLogger(TicTak.class.getName()).log(Level.SEVERE, null, ex);
          }
          finally{
              
           
    Game g=new Game();
    Com_player c=new Com_player(1);



    
    Player p=new Player(1);
    g.joinGame(p, c);
    
    p.play(1);
    c.play();
    
    
    c.play();
    
    c.play();
    c.play();
    c.play();
    c.play();
          System.out.println("ok");
       
              
          }


      }
}
class Com_player extends Player{

    public Com_player(int symbol_id) {
        super(symbol_id);
    }

  
    public ArrayList getPlayerplaces()
    {
         ArrayList allPlaces = new ArrayList();
         ArrayList occupiedPlaces=new ArrayList();
        
         for(int i=1;i<10;i++)
         {
         allPlaces.add(i);
         }
           try {
            String queryString;
             queryString = "select place_id from players_moves where game_id="+this.game_id+" ";
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(queryString) ;
            while(rs.next())
            {
              occupiedPlaces.add(rs.getInt("place_id"));
            }
        } catch (SQLException ex) {
           // Logger.getLogger(Game.class.getName()).log(Level.SEVEREplace_idplace_id, null, ex);
           System.out.println("in com_player class getPlayedplaces");
        }
           finally{
               
            System.out.println("occupiedPlaces==>"+occupiedPlaces);
 
             allPlaces.remove(0);
             allPlaces.removeAll(occupiedPlaces);
//             for(int i =0; i< allPlaces.size() -1 ; i++){
//             for(int j = 0; j < occupiedPlaces.size() -1; j++){
//             if(allPlaces.get(i).equals(occupiedPlaces.get(j))){
//             allPlaces.remove(i);  
//           }
//        }   
//    }
}
                return allPlaces;
}
       //generate random places
     public  int getRandom(ArrayList array) {
     array=this.getPlayerplaces();
    System.out.println("available places"+array);
    System.out.println("array size"+array.size());
    if(array.size()==0)
    {
        System.out.println("there is no free places");
        return 0;
    }
    
    int rnd = new Random().nextInt(array.size() );
    int arr=(int) array.get(rnd);

    return arr;
          }
    
          public int play() {
        try {

            int place_id = getRandom(this.getPlayerPlaces());
            PreparedStatement stmt = conn.prepareStatement("insert into players_moves (game_id,player_id,place_id) values(?,?,?)");
            stmt.setInt(1, this.game_id);
            stmt.setInt(2, this.player_id);
            stmt.setInt(3, place_id);
            stmt.executeUpdate(); 
            
            PreparedStatement st = conn.prepareStatement("insert into video (game_id,symbol_id,player_id,place_id) values(?,?,?,?)");
            st.setInt(1, this.game_id);
            st.setInt(2, this.symbol_id);
            st.setInt(3, this.player_id);
            st.setInt(4, place_id);
            st.executeUpdate();
            System.out.println("Com Played In =>" + place_id);
            return place_id;

        } catch (SQLException ex) {
            Logger.getLogger(Player.class.getName()).log(Level.SEVERE, null, ex);
        }

        return 0;
    }
}
           
