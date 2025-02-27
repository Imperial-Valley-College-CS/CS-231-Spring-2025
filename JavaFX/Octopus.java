import javafx.animation.AnimationTimer;

public class Octopus extends Invader
{
   String[] octopusFiles = {"/OctopusMatrix.txt", "/HurtOctopusMatrix.txt", "/DamagedOctopusMatrix.txt"};
   int count = 0;
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
   
   public void blink()
   {
      if( count % 2 == 0 )
         super.color = Constants.OCTO_COLOR2;
      else
         super.color = Constants.OCTO_COLOR;
      
      count++;   
      if( count > 1000 )
         count = 0;
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
         blink();
         last = now;
      }
   }
}