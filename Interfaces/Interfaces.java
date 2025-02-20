import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

public class Interfaces extends Application
{
   Group g = new Group();
   Scene scene = new Scene(g);
   HandleMouse mh = new HandleMouse();       //create EventHandler<MouseEvent> object
   
   @Override
   public void start(Stage s)
   {
      scene.setOnMouseClicked(mh);    //makes mouse come to live
      s.setScene(scene);
      s.show();   //shows a Stage
   }  
   
   //inner class
   class HandleMouse implements EventHandler<MouseEvent>
   {
      @Override
      public void handle(MouseEvent e)    //invoked when MouseEvent is triggered
      {
         System.out.println( "X: " + e.getX() + ", Y: " + e.getY() );
      }
   }
}