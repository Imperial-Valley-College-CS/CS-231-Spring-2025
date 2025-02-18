import java.io.*;
import java.util.Scanner;

public class TestInvader
{
   public static void main(String[] args)
   {
      Squid squid = new Squid(10,50);
      setBody("InvaderMatrices/CrabMatrix.txt");
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
            System.out.println( scan.nextLine() );
         }
         return null;
      }catch(FileNotFoundException e)
      {
         return null;
      }
   }
}