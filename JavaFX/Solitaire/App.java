import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.Color;
import javafx.scene.canvas.*;
import java.util.*;

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
      Data.createDeck();
      renderStacks();      
      s.setScene(scene);
      s.show();
   }
   
   public void renderDeck()
   {
      double x = 0;
      double y = 0;
      
      for( Card c : Constants.deck )
      {
         //Card c = Constants.deck.get(key);         
         gc.drawImage( c.getImage(), x, y, Constants.cardWid, Constants.cardHei );
         x += Constants.cardWid;
         if( x >= Constants.canWid )
         {
            x = 0;
            y += Constants.cardHei;
         }
      }
   }
   
   public void renderStacks()
   {
      double x = 0;
      double y = 0;
      
      for( Integer key : Constants.stacks.keySet() )
      {
         ArrayList<Card> stack = Constants.stacks.get(key);
         for( Card c : stack )
         {
            //Card c = Constants.deck.get(key);         
            gc.drawImage( c.getImage(), x, y, Constants.cardWid, Constants.cardHei );
            x += Constants.cardWid;
            if( x >= Constants.canWid )
            {
               x = 0;
               y += Constants.cardHei;
            }
         }
      }
   }
}