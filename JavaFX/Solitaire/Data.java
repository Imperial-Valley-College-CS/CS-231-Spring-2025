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
            Constants.deck.put(key, c);
            key++;
         }
      }
   }
}