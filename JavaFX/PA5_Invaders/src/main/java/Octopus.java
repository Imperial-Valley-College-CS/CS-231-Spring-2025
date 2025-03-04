package PA5_Invaders.src.main.java;

import PA5_Invaders.src.test.java.Constants;

import java.io.*;
import java.util.*;
import javafx.scene.paint.Color;
import javafx.animation.AnimationTimer;

public class Octopus extends Invader
{
   private Timer timer = new Timer();
   private String[] octopusFiles = {"/OctopusMatrix.txt", "/HurtOctopusMatrix.txt", "/DamagedOctopusMatrix.txt"};
   private int counter = 0;
   private int xUlim, xLlim;
   private int speedXCoeff = 1;

   public Octopus( int x, int y )
   {
      super(x, y);
      super.color = Constants.OCTOPUS_COLOR;
      super.health = octopusFiles.length;
      super.matrixDirectory += octopusFiles[0];
      super.speedX = Constants.OCTOPUS_SPEED;
      setBody();
   }
   
   public void setXUlim( int x ){ this.xUlim = x; }
   public void setXLlim( int x ){ this.xLlim = x; }
   
   @Override
   public boolean hit()
   { 
      this.timer.start();
      super.hit();
      if( super.isAlive )
      {
         super.matrixDirectory = Constants.MATRIX_DIRECTORY + octopusFiles[octopusFiles.length-super.health];
         super.setBody();
      }
      
      return super.isAlive;
   }
   
   @Override
   public void move()
   {
      super.position.setX( super.position.getX() + super.speedX*this.speedXCoeff );
      super.position.setY( super.position.getY() + super.speedY );
      
      if( super.position.getX() >= this.xUlim || super.position.getX() <= this.xLlim)
         this.speedXCoeff *= -1;
   }
   
   public void reset()
   {      
      super.health = octopusFiles.length;
      super.matrixDirectory = Constants.MATRIX_DIRECTORY + octopusFiles[octopusFiles.length-super.health];
      super.color = Constants.OCTOPUS_COLOR;
      setBody();
      timer.resetHit();
   } 
   
   public void blink()
   {
      if( counter % 2 == 0 )
         super.color = Color.BEIGE;
      else
         super.color = Color.BLUEVIOLET;
         
      if( counter > 1000 )
         counter = 0;
         
      counter++;
   }
   
   class Timer extends AnimationTimer
   {
      private long last = Constants.TIME_INTERVAL;
      private long hitTime = Constants.TIME_INTERVAL;
      private boolean hit = true;
      
      @Override
      public void handle( long now )
      {
         if( hit )
         {
            hitTime = now;
            hit = false;
         }   
         if( now - last > Constants.PERIOD*Constants.TIME_INTERVAL )
         {
            blink();            
            last = now;
         }
         if( now - hitTime > 50*Constants.PERIOD*Constants.TIME_INTERVAL )
         {
            reset();
            timer.stop();
         }
      }//end handle
      
      public void resetHit()
      {
         hit = true;
      }
   }//end Timer
}//end Octopus