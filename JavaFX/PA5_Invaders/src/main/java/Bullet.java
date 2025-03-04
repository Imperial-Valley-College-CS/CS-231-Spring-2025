package PA5_Invaders.src.main.java;

import PA5_Invaders.src.test.java.Constants;

public class Bullet
{
   private Position position;
   private boolean live = true;
   
   public Bullet( int x, int y )
   {
      this.position = new Position( x, y, Constants.BULLET_WIDTH, Constants.BULLET_HEIGHT );
   }
   
   public Position getPosition(){ return this.position; }
   
   public void move()
   {
      this.position.setY( this.position.getY() - Constants.BULLET_SPEED);
   }
   
   public boolean live(){ return this.live; }
   
   public void hit()
   {
      this.live = false;
   }
}