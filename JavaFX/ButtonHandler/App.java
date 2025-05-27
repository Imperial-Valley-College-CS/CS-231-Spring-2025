import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.event.*;
import javafx.scene.text.Font;
import javafx.scene.control.ComboBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.control.Label;

public class App extends Application
{
   ComboBox<HBox> cmb = new ComboBox<HBox>();
   private Font font = new Font("OK",40);
   private Button bttn = new Button();
   private Scene scene = new Scene(cmb);
   private BttnHandler handleBttn = new BttnHandler();
   
   HBox box1 = new HBox(new Rectangle(10, 10, Color.RED), new Label("RED"));
   HBox box2 = new HBox(new Rectangle(10, 10, Color.BLUE), new Label("BLUE"));
   HBox box3 = new HBox(new Rectangle(10, 10, Color.GREEN), new Label("GREEN"));
   
   @Override
   public void start( Stage s )
   {
      
      cmb.getItems().addAll( box1, box2, box3 );
     
      bttn.setFont( font );
      bttn.setText("OK");
      bttn.setOnAction(handleBttn);    //makes button come to life
      s.setScene( scene ); 
      s.show();
   }
   
   class BttnHandler implements EventHandler<ActionEvent>
   {
      @Override
      public void handle(ActionEvent e)
      {
         Button pressedBttn = (Button)e.getSource();
         if( pressedBttn.getText().equals("OK") )
            System.out.println( "Hi" );
      }
   }
}