import javafx.scene.paint.Color;
import java.io.*;
import java.util.*;

public class Invader
{
   //data fields
   protected double health, speedX, speedY;
   protected int rows = 8;
   protected int cols = 12;
   protected Color color;
   protected Position pos;
   protected boolean isAlive = true;
   protected boolean[][] body = new boolean[rows][cols];
   protected String userDir, matDir;
   
   //constructor(s)
   public Invader(int x, int y)
   {
      this.pos = new Position(x,y);
      this.body = new boolean[rows][cols];
   }
   
   protected Position getPosition(){ return this.pos; }
   
   protected boolean[][] getBody(){ return this.body; }
   protected Color getColor(){ return this.color; }
   protected boolean alive(){ return this.isAlive; }
   
   protected boolean hit()
   {
      this.health--;
      if( this.health < 0 )
         this.isAlive = false;
         
      return this.isAlive;
   }
   
   protected void setBody( String filename )
   {
      File f = new File( filename );
      try
      {
         Scanner scan = new Scanner(f);
         
         
         for( int i = 0; i < body.length; i++ )
         {         
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            for( int j = 0; j < tokens.length; j++ )
            {  
               if( tokens[j].equals("1") )
                  this.body[i][j] = true;
               else
                  this.body[i][j] = false;
            }
         }
      }catch(FileNotFoundException e)
      {
         System.out.println( e.getMessage() );
      }
   }
}