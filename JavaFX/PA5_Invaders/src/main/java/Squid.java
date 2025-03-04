package PA5_Invaders.src.main.java;

import PA5_Invaders.src.test.java.Constants;

import java.io.*;
import java.util.*;
import javafx.scene.paint.Color;

public class Squid extends Invader
{
   private String[] squidFiles = {"/SquidMatrix.txt"};
   private int speedXCoeff = 1;

   public Squid( int x, int y )
   {
      super(x, y);
      super.color = Constants.SQUID_COLOR;
      super.health = squidFiles.length;
      super.matrixDirectory += squidFiles[0];
      super.speedX = Constants.SQUID_SPEED;
      super.setBody();
   }
   
   @Override
   public void move()
   {
      super.position.setX( super.position.getX() + super.speedX*this.speedXCoeff );
      super.position.setY( super.position.getY() + super.speedY );
      this.speedXCoeff *= -1;
   }   
}