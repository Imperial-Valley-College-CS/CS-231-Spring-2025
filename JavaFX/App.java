import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.*;

public class App extends Application
{
   Canvas canvas = new Canvas();
   GraphicsContext gc = canvas.getGraphicsContext2D();
   Group g = new Group(canvas);
   Scene scene = new Scene(g);
   Octopus octo = new Octopus(50, 50);
   
   @Override
   public void start(Stage s)
   {
      s.setScene(scene);
      s.show();
   }
}