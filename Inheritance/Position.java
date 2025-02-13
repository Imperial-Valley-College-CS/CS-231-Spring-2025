public class Position
{
   //data fields
   private int x, y;
   
   //constructor(s)
   public Position( int x, int y )
   {
      this.x = x;
      this.y = y;
   }
   
   //methods
   public void setX( int x ){ this.x = x; }
   public void setY( int y ){ this.y = y; }
   public int getX(){ return this.x; }
   public int getY(){ return this.y; }
}