import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;

public class App extends Application
{
   Group g = new Group();     //no argument necessary
   Scene scene = new Scene(g); //Parent argument required
   Canvas canvas = new Canvas(400,600);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   @Override
   public void start(Stage s)
   {
      g.getChildren().add( canvas );
      Card c = new Card("2","C");
      gc.drawImage( c.getImage(), 50, 50 );
      s.setScene(scene);
      s.show();
   }
}