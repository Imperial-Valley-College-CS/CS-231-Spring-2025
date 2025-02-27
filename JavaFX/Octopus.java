import javafx.animation.AnimationTimer;

public class Octopus extends Invader
{
   Timer timer = new Timer();
   
   public Octopus(int x, int y)
   {
      super(x,y);
      super.color = Constants.OCTO_COLOR;
      setBody("OctopusMatrix.txt");
      timer.start();    //starts our timer(invokes handle method on every frame)
   }

   class Timer extends AnimationTimer
   {
      long last = 0;
      @Override
      public void handle(long now)     //invoked on every computational frame
      {
         long dt = now - last;
         double dtSec = (double)(dt)*Math.pow(10,-9);
         System.out.printf( "%.3f%n", dtSec );
         last = now;
      }
   }
}