public class Data
{
   public static void createDeck()
   {
      for( String suit : Constants.suits )
      {
         for( String rank : Constants.ranks )
         {
            Card c = new Card(rank, suit);
            System.out.println( c.hashCode() );
            Constants.deck.add(c);
         }
      }
   }
}