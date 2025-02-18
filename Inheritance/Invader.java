import javafx.scene.paint.Color;

public class Invader
{
   //data fields
   protected int health, speedX, speedY;
   protected int rows = 8;
   protected int cols = 12;
   protected Color color;
   protected Position pos;
   protected boolean isAlive;
   protected boolean[][] body;
   protected String userDir, matDir;
   
   //constructor(s)
   public Invader(int x, int y)
   {
      this.pos = new Position(x,y);
      this.body = new boolean[rows][cols];
   }
}