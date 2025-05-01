import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;

public class App extends Application
{
   Group g = new Group();     //no argument necessary
   Scene scene = new Scene(g); //Parent argument required
   Canvas canvas = new Canvas(Constants.canWid,Constants.canHei);
   GraphicsContext gc = canvas.getGraphicsContext2D();
   
   @Override
   public void start(Stage s)
   {
      g.getChildren().add( canvas );
      Card c = new Card("2","C");
      Card ca = new Card("J","H");
      double x = 50;
      double y = 50;
      gc.drawImage( c.getImage(), x, y, Constants.cardWid, Constants.cardHei );
      y += 30;
      gc.drawImage( ca.getImage(), x, y, Constants.cardWid, Constants.cardHei );
      
      s.setScene(scene);
      s.show();
   }
}