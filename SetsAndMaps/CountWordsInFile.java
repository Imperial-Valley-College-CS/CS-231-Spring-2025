import java.util.*;
import java.io.*;

public class CountWordsInFile
{
   public static String text;
   public static HashMap<String,Integer> words = 
                  new HashMap<>();
   
   public static void main(String[] args)
   {
      text = readFile( "DeclarationOfIndependence.txt" );
      //System.out.println( text );
      displayOccurrences();
   }
   
   public static String readFile( String filename )
   {
      try
      {
         String text = "";
         File f = new File(filename);
         Scanner scan = new Scanner(f);
         
         while( scan.hasNextLine() )
            text += scan.nextLine() + " ";
         
         text = text.toLowerCase().replace("-"," ");
         text = text.replaceAll("[^a-z ]","");
         // text = text.replace(",","");
//          text = text.replace(";","");
//          text = text.replace(":","");
//          text = text.replace("'","");
            
         return text;
      }catch( FileNotFoundException e )
      {
         System.out.println( e.getMessage() );
         return null;
      }
   }
   
   public static void displayOccurrences()
   {
      String[] tokens = text.split(" ");
      // for( String t : tokens )
//          System.out.println( t.replace(",","").replace(".","") );
      for( String t : tokens )
      {
         if( words.containsKey( t ) )
         {
            int count = words.get(t) + 1;
            words.put(t,count);
         }else
            words.put(t,1);
      }
      
      System.out.println( words );
   }
}