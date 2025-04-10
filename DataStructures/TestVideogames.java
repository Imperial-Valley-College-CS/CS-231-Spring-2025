import java.util.*;
import java.io.*;

public class TestVideogames
{
   public static void main(String[] args)
   {
      ArrayList<Videogame> games = readData("VideogameData/DataSheetVideogames.csv");
   }
   
   public static ArrayList<Videogame> readData( String filename )
   {
      try
      {   
         FileReader file = new FileReader(filename);
         BufferedReader scan = new BufferedReader(file); 
         ArrayList<Videogame> videogames = new ArrayList<>();       
         scan.readLine();  //scan first line in csv (column headings)
         int count = 0;
         
         do
         {
            String[] fields = scan.readLine().split(",");
            int sales = Integer.parseInt(fields[1]);
            Videogame v = new Videogame(fields[0], sales, fields[4]);
            videogames.add( v );
            count++;
                      
         }while( count < 50 );
         
         scan.close();
         return videogames;
         
      }catch( FileNotFoundException e )
      {
         System.out.println( filename + " not found. " );
         return null;
      }catch( IOException e )
      {
         System.out.println( filename + " not found. " );
         return null;
      }
   }

}