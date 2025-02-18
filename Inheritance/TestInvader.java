import java.io.*;
import java.util.*;

public class TestInvader
{
   public static void main(String[] args)
   {
      Squid squid = new Squid(10,50);
      boolean[][] body = setBody("InvaderMatrices/CrabMatrix.txt");
      for( boolean[] row : body )
      {
         System.out.println( Arrays.toString(row) );
      }
   }
   
   public static boolean[][] setBody( String filename )
   {
      File f = new File( filename );
      try
      {
         Scanner scan = new Scanner(f);
         
         boolean[][] body = new boolean[8][12];
         for( int i = 0; i < body.length; i++ )
         {         
            String line = scan.nextLine();
            String[] tokens = line.split(",");
            for( int j = 0; j < tokens.length; j++ )
            {  
               if( tokens[j].equals("1") )
                  body[i][j] = true;
               else
                  body[i][j] = false;
            }
         }
         return body;
      }catch(FileNotFoundException e)
      {
         return null;
      }
   }
}