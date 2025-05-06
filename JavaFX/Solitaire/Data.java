import java.util.*;

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
      
      int i = 0;
      for( Integer kkey : Constants.stacks.keySet() )
      {
         ArrayList<Card> stack = Constants.stacks.get(kkey);
         int count = 0; 
         while( count < kkey )
         {
            stack.add( Constants.deck.get(i) );
            count++;
            i++;
         }
      }
   }
}