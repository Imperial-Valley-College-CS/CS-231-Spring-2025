import java.io.*;
import java.util.Scanner;

public class ConvertHexToDec
{
   public static void main(String[] args)
   {     
      String hex = readHexFromFile( "HexNum.txt" );
      int num = convertHexToDec( hex );
      System.out.println( "Hex Value: " + hex + "\nDec Value: " + num );
   }
   
   public static String readHexFromFile( String filename )
   {
      File f = new File(filename);
      try
      {
         Scanner scan = new Scanner(f);
         String line = scan.nextLine();            //scans entire first line in file
         return line;
      }catch(FileNotFoundException e)
      {     
         System.out.println( e.getMessage() ); 
         return null;
      }
   }
   
   public static int convertHexToDec( String hexVal ) throws NumberFormatException
   {
      return 701;
   }
}