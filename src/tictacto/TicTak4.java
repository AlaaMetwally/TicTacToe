package tictacto;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public  class TicTak4 extends Pane{

    protected final ImageView imageView;
    protected final Button reset;
    protected final Button back;
    protected final Button button1;
    protected final Button button2;
    protected final Button button3;
    protected final Button button4;
    protected final Button button5;
    protected final Button button6;
    protected final Button button7;
    protected final Button button8;
    protected final Button button9;
    protected final Text text1;
    protected final Text text2;
    protected final Text text3;
    protected final Text text4;
    protected final Text text5;
    protected final Text text6;
    protected final Text text7;
    protected final Text text8;
    protected final Text text9;
    Stage primaryStage;
    public TicTak4(Stage stage4) {
        TicTak3 tic=new TicTak3 (stage4);
        tic.p1=new Player(1);
        tic.c=new Com_player(1);
        tic.g=new Game();
        tic.g.joinGame(tic.p1, tic.c);
        
        imageView = new ImageView();
        reset = new Button();
        back = new Button();
        button1 = new Button();
        button2 = new Button();
        button3 = new Button();
        button4 = new Button();
        button5 = new Button();
        button6 = new Button();
        button7 = new Button();
        button8 = new Button();
        button9 = new Button();
        
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
        setMaxWidth(426.0);        setMinHeight(321.0);
        setMinWidth(420.0);
        setPrefHeight(351.0);
        setPrefWidth(421.0);

        imageView.setFitHeight(352.0);
        imageView.setFitWidth(422.0);
        imageView.setPickOnBounds(true);
        imageView.setPreserveRatio(true);
        imageView.setImage(new Image(getClass().getResource("gameframe.png").toExternalForm()));

        reset.setLayoutX(21.0);
        reset.setLayoutY(257.0);
        reset.setMnemonicParsing(false);
        reset.setOpacity(0.0);
        reset.setPrefHeight(33.0);
        reset.setPrefWidth(67.0);
        reset.setText("Button");
        reset.setOnAction((ActionEvent event) -> {
            System.out.println("reset");
            TicTak4 root1 = new TicTak4(stage4);
            Scene scene1 = new Scene(root1, 422, 350);
            stage4.setTitle("TicTacToe");
            stage4.setScene(scene1);
            stage4.show();
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
            TicTak2 root1 = new TicTak2(stage4);
            Scene scene1 = new Scene(root1, 422, 350);
            stage4.setTitle("TicTacToe");
            stage4.setScene(scene1);
            stage4.show();
            
        });         
        button1.setLayoutX(111.0);
        button1.setLayoutY(93.0);
        button1.setMnemonicParsing(false);
        button1.setOpacity(0.0);
        button1.setPrefHeight(55.0);
        button1.setPrefWidth(52.0);
        button1.setText("Button");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                
  
     System.out.print(tic.symbol_id);
     if(tic.symbol_id==1)
     {
     
      text1.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
      text1.setX(111.0);
      text1.setY(140.0);
      text1.setText("X");
      text1.setFill(Color.web("#d3711d"));   
     }

     else if(tic.symbol_id==2)
     {       
      text1.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
      text1.setX(111.0);
      text1.setY(140.0);
      text1.setText("O");
      text1.setFill(Color.web("#d3711d"));        
     }
         tic.p1.play(1);
         if(tic.p1.checkWin())
         {
              if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
             System.out.println("P1 IS THE WINNER");  
             return;
         }
          int tmpPlaceId=tic.c.play();
          drawForComPlayer(tmpPlaceId,tic.symbol_id);
         
         if(tic.c.checkWin())
         {
             System.out.println("Com IS THE WINNER");
                if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
             return;
         }          
   }            
  });
        button2.setLayoutX(176.0);
        button2.setLayoutY(93.0);
        button2.setMnemonicParsing(false);
        button2.setOpacity(0.0);
        button2.setPrefHeight(55.0);
        button2.setPrefWidth(67.0);
        button2.setText("Button");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.print(tic.symbol_id);
                    if(tic.symbol_id==1)
                    {
                        text2.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                        text2.setX(185.0);
                        text2.setY(140.0);
                        text2.setText("X");
                        text2.setFill(Color.web("#d3711d"));      
                    }

                    else if(tic.symbol_id==2)
                    {
                        text2.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                        text2.setX(185.0);
                        text2.setY(140.0);
                        text2.setText("O");
                        text2.setFill(Color.web("#d3711d"));      
                    }
                        System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(2);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER"); 
                         if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                        
                        int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                           System.out.println("Com IS THE WINNER");
                           if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }
            }
        });
        
        button3.setLayoutX(258.0);
        button3.setLayoutY(93.0);
        button3.setMnemonicParsing(false);
        button3.setOpacity(0.0);
        button3.setPrefHeight(55.0);
        button3.setPrefWidth(60.0);
        button3.setText("Button");
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
         if(tic.symbol_id==1)
                    {
                     text3.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text3.setX(259.0);
                     text3.setY(140.0);
                     text3.setText("X");
                     text3.setFill(Color.web("#d3711d"));   
                    }

                    else if(tic.symbol_id==2)
                    {
                     text3.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text3.setX(259.0);
                     text3.setY(140.0);
                     text3.setText("O");
                     text3.setFill(Color.web("#d3711d"));   

                    }
                        System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(3);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER");  
                         if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                       int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                           System.out.println("Com IS THE WINNER");
                          if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }
            
            }
        });
        button4.setLayoutX(111.0);
        button4.setLayoutY(155.0);
        button4.setMnemonicParsing(false);
        button4.setOpacity(0.0);
        button4.setPrefHeight(69.0);
        button4.setPrefWidth(52.0);
        button4.setText("Button");
        button4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    if(tic.symbol_id==1)
                    {
                     text4.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text4.setX(111.0);
                     text4.setY(210.0);
                     text4.setText("X");
                     text4.setFill(Color.web("#d3711d"));   
                    }

                    else if(tic.symbol_id==2)
                    {
                     text4.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text4.setX(111.0);
                     text4.setY(210.0);
                     text4.setText("O");
                     text4.setFill(Color.web("#d3711d"));   
                    }
                        System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(4);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER");  
                            if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                        int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                           System.out.println("Com IS THE WINNER");
                       if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }

            }
        });
        button5.setLayoutX(176.0);
        button5.setLayoutY(155.0);
        button5.setMnemonicParsing(false);
        button5.setOpacity(0.0);
        button5.setPrefHeight(69.0);
        button5.setPrefWidth(67.0);
        button5.setText("Button");
        button5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    if(tic.symbol_id==1)
                    {
                     text5.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text5.setX(185.0);
                     text5.setY(210.0);
                     text5.setText("X");
                     text5.setFill(Color.web("#d3711d"));   
                    }

                    else if(tic.symbol_id==2)
                    {
                     text5.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text5.setX(185.0);
                     text5.setY(210.0);
                     text5.setText("O");
                     text5.setFill(Color.web("#d3711d"));   
                    }
                        System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(5);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER"); 
                      if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                        int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                           System.out.println("Com IS THE WINNER");
                         if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }
     }
            
        });
        button6.setLayoutX(255.0);
        button6.setLayoutY(160.0);
        button6.setMnemonicParsing(false);
        button6.setOpacity(0.0);
        button6.setPrefHeight(62.0);
        button6.setPrefWidth(60.0);
        button6.setText("Button");
        button6.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
  
                    if(tic.symbol_id==1)
                    {
                     text6.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text6.setX(260.0);
                     text6.setY(210.0);
                     text6.setText("X");
                     text6.setFill(Color.web("#d3711d"));   
                    }

                    else if(tic.symbol_id==2)
                    {
                     text6.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text6.setX(260.0);
                     text6.setY(210.0);
                     text6.setText("O");
                     text6.setFill(Color.web("#d3711d"));   
                    }
                        System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(6);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER");  
                           if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                        int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                           System.out.println("Com IS THE WINNER");
                             if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }
            }
        });
        button7.setLayoutX(103.0);
        button7.setLayoutY(236.0);
        button7.setMnemonicParsing(false);
        button7.setOpacity(0.0);
        button7.setPrefHeight(55.0);
        button7.setPrefWidth(60.0);
        button7.setText("Button");
        button7.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    if(tic.symbol_id==1)
                    {
                     text7.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text7.setX(111.0);
                     text7.setY(285.0);
                     text7.setText("X");
                     text7.setFill(Color.web("#d3711d"));   
                    }

                    else if(tic.symbol_id==2)
                    {
                     text7.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text7.setX(111.0);
                     text7.setY(285.0);
                     text7.setText("O");
                     text7.setFill(Color.web("#d3711d"));   
                    }
                        System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(7);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER");  
                             if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                        int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                           System.out.println("Com IS THE WINNER");
                             if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }
            }
        });
        button8.setLayoutX(176.0);
        button8.setLayoutY(236.0);
        button8.setMnemonicParsing(false);
        button8.setOpacity(0.0);
        button8.setPrefHeight(55.0);
        button8.setPrefWidth(67.0);
        button8.setText("Button");
        button8.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    if(tic.symbol_id==1)
                    {
                     text8.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text8.setX(185.0);
                     text8.setY(285.0);
                     text8.setText("X");
                     text8.setFill(Color.web("#d3711d"));   
                    }

                    else if(tic.symbol_id==2)
                    {
                     text8.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text8.setX(185.0);
                     text8.setY(285.0);
                     text8.setText("O");
                     text8.setFill(Color.web("#d3711d"));   
                    }
                    System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(8);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER");  
                         if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                        int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                            System.out.println("Com IS THE WINNER");
                            if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }
            }
        });
        button9.setLayoutX(254.0);
        button9.setLayoutY(235.0);
        button9.setMnemonicParsing(false);
        button9.setOpacity(0.0);
        button9.setPrefHeight(55.0);
        button9.setPrefWidth(60.0);
        button9.setText("Button");
        button9.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                    if(tic.symbol_id==1)
                    {
                     text9.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text9.setX(259.0);
                     text9.setY(285.0);
                     text9.setText("X");
                     text9.setFill(Color.web("#d3711d"));   
                    }

                    else if(tic.symbol_id==2)
                    {
                     text9.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
                     text9.setX(259.0);
                     text9.setY(285.0);
                     text9.setText("O");
                     text9.setFill(Color.web("#d3711d"));   
                    }
                        System.out.println("huPlayerid from inside"+tic.p1.player_id+"and c_id "+tic.c.player_id);
                        tic.p1.play(9);
                        if(tic.p1.checkWin())
                        {
                            System.out.println("P1 IS THE WINNER");                                
                             if(tic.symbol_id==1)
                           {
                           TicTakwinx root1 = new TicTakwinx(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TicTakwino root1 = new TicTakwino(); 
                           root1.start(stage4);    
                           }
                            return;
                        }
                        int tmpPlaceId=tic.c.play();
                        drawForComPlayer(tmpPlaceId,tic.symbol_id);

                       if(tic.c.checkWin())
                       {
                           System.out.println("Com IS THE WINNER");
                           if(tic.symbol_id==2)
                           {
                           TikTacloseo root1 = new TikTacloseo(); 
                           root1.start(stage4); 
                           }
                           else
                           {
                           TikTaclosex root1 = new TikTaclosex();
                           root1.start(stage4);    
                           }
                           return;
                       }
            }
        });
        getChildren().add(imageView);
        getChildren().add(reset);
        getChildren().add(back);
        getChildren().add(button1);
        getChildren().add(button2);
        getChildren().add(button3);
        getChildren().add(button4);
        getChildren().add(button5);
        getChildren().add(button6);
        getChildren().add(button7);
        getChildren().add(button8);
        getChildren().add(button9);
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
    private void drawForComPlayer(int tmpPlaceId,int symbol_id) {
        String comSymbol;
        float x;
        float y;
        Text textObj;
                
        if(symbol_id==1)
        {
            comSymbol="O";
        }
        else
        {
           comSymbol="X";
        }
        
       
        if(tmpPlaceId==1)
        {
             textObj = text1;
             x=(float) 111.0;
             y=(float) 140.0;            
        }
        else if(tmpPlaceId==2)
        {
            textObj = text2;
             x=(float) 185.0;
             y=(float) 140.0;
        }
        else if(tmpPlaceId==3)
        {
             textObj = text3;
             x=(float) 259.0;
             y=(float) 140.0;
        }
        else if(tmpPlaceId==4)
        {
             textObj = text4;
             x=(float) 111.0;
             y=(float) 210.0;

        }
        else if(tmpPlaceId==5)
        {
            textObj = text5;
             x=(float) 185.0;
             y=(float) 210.0;
        }
        else if(tmpPlaceId ==6 )
        {
            textObj = text6;
             x=(float) 259.0;
             y=(float) 210.0;

        }
        else if(tmpPlaceId== 7)
        {
            textObj = text7;
             x=(float) 111.0;
             y=(float) 285.0;

        }
        else if(tmpPlaceId == 8)
        {
            textObj = text8;
             x=(float) 185.0;
             y=(float) 285.0;
        }
        else if(tmpPlaceId==9)
        {
            textObj = text9;
             x=(float) 259.0;
             y=(float) 285.0;

        }
        else
        {
              textObj = text8;
             x=(float) 185.0;
             y=(float) 285.0;  
        }
        
      textObj.setFont(Font.font("Verdana", FontWeight.BOLD, 60));
      textObj.setX(x);
      textObj.setY(y);
      textObj.setText(comSymbol);
      textObj.setFill(Color.web("#d3711d"));   
                
            }
}
