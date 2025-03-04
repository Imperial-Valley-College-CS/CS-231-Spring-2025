package PA5_Invaders.src.main.java;

import PA5_Invaders.src.test.java.Constants;

import java.io.*;
import java.util.*;
import javafx.scene.paint.Color;

public class Crab extends Invader
{
   private String[] crabFiles = {"/CrabMatrix.txt", "/HurtCrabMatrix.txt"};
   private Color HURT_COLOR = Color.ORANGE;

   public Crab( int x, int y )
   {
      super(x, y);
      super.color = Constants.CRAB_COLOR;
      super.health = crabFiles.length;
      super.matrixDirectory += crabFiles[crabFiles.length-super.health];
      super.speedX = Constants.CRAB_SPEED;
      setBody();
   }
   
   @Override
   public boolean hit()
   {
      super.hit();
      if( super.isAlive )
      {
         super.matrixDirectory = Constants.MATRIX_DIRECTORY + crabFiles[crabFiles.length-super.health];
         super.setBody();
         super.color = this.HURT_COLOR;
         return super.isAlive;
      }
      
      return super.isAlive;
   }
   
   @Override
   public void move()
   {
      super.position.setX( super.position.getX() + super.speedX );
      super.position.setY( super.position.getY() + super.speedY );
      if( super.position.getDomain() > Constants.WIDTH )
         super.position.setX( 0 );
   } 
}