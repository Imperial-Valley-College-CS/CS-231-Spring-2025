import javafx.animation.AnimationTimer;

public class Octopus extends Invader
{
   String[] octopusFiles = {"/OctopusMatrix.txt", "/HurtOctopusMatrix.txt", "/DamagedOctopusMatrix.txt"};
   Timer timer = new Timer();
   
   public Octopus(int x, int y)
   {
      super(x,y);
      super.color = Constants.OCTO_COLOR;
      super.health = octopusFiles.length;
      super.speedX = Constants.OCTO_SPEED;
      setBody("InvaderMatrices" + octopusFiles[0]);
      //timer.start();    //starts our timer(invokes handle method on every frame)
   }
   
   @Override
   public boolean hit()
   {
      timer.start();
      super.hit();         //decrements health by 1
      if( super.health > 0 )
      {
         int index = octopusFiles.length-(int)super.health;
         setBody( "InvaderMatrices" + octopusFiles[index] );
      }
      
      return super.isAlive;      
   }

   class Timer extends AnimationTimer
   {
      long last = 0;
      @Override
      public void handle(long now)     //invoked on every computational frame
      {
         long dt = now - last;
         double dtSec = (double)(dt)*Math.pow(10,-9);
         //System.out.printf( "%.3f%n", dtSec );
         last = now;
      }
   }
}