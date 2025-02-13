import java.io.*;
import java.util.Scanner;

public class ConvertHexToDec
{
   public static void main(String[] args)
   {     
      try
      {
         String hex = readHexFromFile( "HexNum.txt" );
         int num = convertHexToDec( hex );
         writeToFile(hex, num);
         System.out.println( "Hex Value: " + hex + "\nDec Value: " + num );
      }catch( NumberFormatException e )
      {
         System.out.println( e.getMessage() );
      }
   }
   
   public static void writeToFile(String hexVal, int decVal)
   {
      File f = new File("DecValues.txt");
      try
      {
         PrintWriter printToFile = new PrintWriter( f );
         printToFile.println("Hex Val: " + hexVal + ", Dec Val: " + decVal);
         printToFile.close();
      }catch(FileNotFoundException e )
      {
         System.out.println( e.getMessage() );
      }
   }
   
   public static String readHexFromFile( String filename )
   {
      File f = new File(filename);
      try
      {
         Scanner scan = new Scanner(f);
         String line = "";
         while( scan.hasNextLine() )
         {
            line = scan.nextLine();            //scans entire first line in file
            System.out.println( "Debug: " + line );
         }
         return line;
      }catch(FileNotFoundException e)
      {     
         System.out.println( e.getMessage() ); 
         return null;
      }
   }
   
   public static int convertHexToDec( String hexVal ) throws NumberFormatException
   {
      int dec = 0; int exp = 0;
      for(int i = hexVal.length()-1; i >= 0; i--)
      {
         char digit = hexVal.charAt(i);
         int num;
         if( digit >= 48 && digit <= 57 )
            num = digit - 48;
         else if( digit >= 65 && digit <= 70 )
            num = digit - 55;
         else
            throw new NumberFormatException("Invalid Hex Character");
         
         dec += num*Math.pow(16,exp);
         exp++;
      }
      return dec;
   }
}