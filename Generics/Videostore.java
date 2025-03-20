public class Videostore
{
   public static void main(String[] args)
   {
      Videogame v1 = new Videogame("Persona 5");
      Videogame v2 = new Videogame("Freedom Planet");
      Videogame v3 = new Videogame("Fortnite");
      Videogame v4 = new Videogame("2048");
      
      ArrayList<Videogame> vids = new ArrayList<Videogame>();
      vids.add( v1 );
      vids.add( v2 );
      vids.add( v3 );
   }
}