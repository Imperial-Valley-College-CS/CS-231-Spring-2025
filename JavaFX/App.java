import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;
import javafx.event.*;
import javafx.scene.input.KeyEvent;

public class App extends Application
{
   Canvas canvas = new Canvas(Constants.CANVAS_WIDTH, Constants.CANVAS_HEIGHT);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Group g = new Group(canvas);
   Scene scene = new Scene(g);
   Octopus octo = new Octopus(0, 50);
   int size = 5;
   Timer timer = new Timer();
   KeyHandler handleKey = new KeyHandler();
   
   @Override
   public void start(Stage s)
   {
      timer.start();
      //drawInvader();
      scene.setOnKeyPressed(handleKey);      //makes keyboard come alive
      s.setScene(scene);
      s.show();
   }
   
   public void drawInvader()
   {
      gc.setFill( Constants.BKGRND_COLOR );
      gc.fillRect(0,0,Constants.CANVAS_WIDTH, Constants.CANVAS_HEIGHT);
      
      gc.setFill( octo.getColor() );
      boolean[][] body = octo.getBody();
      
      int xStart = octo.getPosition().getX();
      int yStart = octo.getPosition().getY();
      int x = xStart;
      int y = yStart; 
      for( int i = 0; i < body.length; i++ )
      {
         for( int j = 0; j < body[i].length; j++ )
         {
            if( body[i][j] )
               gc.fillRect(x,y,size,size);
               
            x+= size;     //increment x by 10 to draw next square in row
         }
         x = xStart; y+= size;      //reset x to 50 and increment y by 10 to go to next row
      }
   }
   
   public void move()
   {
      int x = octo.getPosition().getX();
      int y = octo.getPosition().getY();
      x += 1*size;
      //y += size;
      octo.getPosition().setX( x );
      if( x > Constants.CANVAS_WIDTH )          
         octo.getPosition().setX( 0 );
   }
   
   class Timer extends AnimationTimer
   {
      long last = 0;
      long dt = 16000000;
      
      @Override
      public void handle(long now)     //invoked on every computational frame
      {
         if( now - last > 1*dt )    //move every five frames
         {
            move();
            if( octo.alive() )
               drawInvader();
            last = now;
         }
      }
   }
   
   class KeyHandler implements EventHandler<KeyEvent>
   {
      @Override
      public void handle(KeyEvent e)
      {
         System.out.println( e.getText() );
         if( e.getText().equals("a") )
         {
            octo.hit();       //invoke hit on Octopus when space key is pressed
         }
      }
   }
}