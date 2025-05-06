import java.util.Collections;

public class Data
{
   public static void createDeck()
   {
      int key = 1;
      for( String suit : Constants.suits )
      {
         for( String rank : Constants.ranks )
         {
            Card c = new Card(rank, suit);
            //System.out.println( c.hashCode() );
            //Constants.deck.put(key, c);
            Constants.deck.add(c);
            key++;
         }
      }
      Collections.shuffle( Constants.deck );
   }
   
   public static void createStacks()
   {
      int key = 1;
      while( key <= 7 )
      {
         Constants.stacks.put(key, new ArrayList<>() );
         key++;
      }
      
      key = 1;
      int counter = 1;
      int index = 0;
      
      while( index < 28 )
      {
         Card c = Constants.deck.remove(index);
         Constants.stacks.get(key).add(c);
         if( key % counter == 0 )
         {
            counter = 1;
            key++;
         }
         counter++;
         index++;
      }
   }
}