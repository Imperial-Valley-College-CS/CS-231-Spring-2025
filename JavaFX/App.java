import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;
import javafx.scene.paint.Color;

public class App extends Application
{
   Canvas canvas = new Canvas(400, 400);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Group g = new Group(canvas);
   Scene scene = new Scene(g);
   Octopus octo = new Octopus(50, 50);
   
   @Override
   public void start(Stage s)
   {
      drawInvader();
      s.setScene(scene);
      s.show();
   }
   
   public void drawInvader()
   {
      gc.setFill( Color.RED );
      boolean[][] body = octo.getBody();
      
      int x = 50; int y = 50; int size = 10;
      for( boolean[] row : body )
      {
         for( boolean val : row )
         {
            if( val )
               gc.fillRect(x,y,size,size);
               
            x+= 10;     //increment x by 10 to draw next square in row
         }
         x = 50; y+= 10;      //reset x to 50 and increment y by 10 to go to next row
      }
   }
}