package PA5_Invaders.src.main.java;

import PA5_Invaders.src.test.java.Constants;

import java.io.*;
import java.util.*;
import javafx.scene.paint.Color;

public class Player
{
   protected int health;
   protected Position position;
   protected boolean[][] body;
   protected String matrixDirectory = Constants.MATRIX_DIRECTORY + "/Spaceship.txt";
   
   public Player( int x, int y )
   {
      this.position = new Position( x, y, Constants.PLAYER_WIDTH,
         Constants.PLAYER_HEIGHT);
      this.body = new boolean[Constants.PLAYER_ROWS][Constants.PLAYER_COLS];
      setBody();
   }
   
   public boolean[][] getBody(){ return this.body; }
   public Position getPosition(){ return this.position; }
   
   public void setBody()
   {
      File f = new File( matrixDirectory );
      try
      {
         Scanner scan = new Scanner(f);
         int row = 0;
         while( scan.hasNextLine() )
         {
            int col = 0;
            String[] nextLine = scan.nextLine().split(",");
            for( String s : nextLine )
            {
               body[row][col] = s.equals("1");
               col++;
            }
            row++;
         }         
      }catch( FileNotFoundException e )
      {
         System.out.println( matrixDirectory + " not found." );
      }
   }//end setBody
   
   public void move( int deltaX )
   {
      this.position.setX( this.position.getX()+deltaX );
      if( this.position.getX() <= 0 )
         this.position.setX(0);
      if( this.position.getX() >= Constants.WIDTH-Constants.PLAYER_WIDTH )
         this.position.setX( Constants.WIDTH-Constants.PLAYER_WIDTH );
   }
}