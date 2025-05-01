import javafx.application.Application;
import javafx.stage.Stage;

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
      gc.setFill( Color.RED );
      gc.fillRect(50,50,10,10);
      Card c = new Card("2","C");
      s.show();
   }
}