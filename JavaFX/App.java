import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class App extends Application
{
   Canvas canvas = new Canvas(400, 400);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Group g = new Group(canvas);
   Scene scene = new Scene(g);
   Octopus octo = new Octopus(0, 50);
   int size = 5;
   Timer timer = new Timer();
   
   @Override
   public void start(Stage s)
   {
      timer.start();
      //drawInvader();
      s.setScene(scene);
      s.show();
   }
   
   public void drawInvader()
   {
      gc.setFill( Color.BLACK );
      gc.fillRect(0,0,400, 400 );
      
      gc.setFill( Color.RED );
      boolean[][] body = octo.getBody();
      
      int xStart = octo.getPosition().getX();
      int yStart = octo.getPosition().getY();
      int x = xStart;
      int y = yStart; 
      for( boolean[] row : body )
      {
         for( boolean val : row )
         {
            if( val )
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
      x += size;
      //y += size;
      octo.getPosition().setX( x );
      if( x > 400 )          
         octo.getPosition().setX( 0 );
   }
   
   class Timer extends AnimationTimer
   {
      long last = 0;
      @Override
      public void handle(long now)     //invoked on every computational frame
      {
         long dt = now - last;
         double dtSec = (double)(dt)*Math.pow(10,-9);
         move();
         drawInvader();
         last = now;
      }
   }
}