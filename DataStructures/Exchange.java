public class Exchange
{
   private static Queue<Block> trans = new LinkedList<>();
   private static double totalProfit = 0.0;
   
   public static void main(String[] args)
   {
//       Scanner scan = new Scanner(System.in);
//       int shares = scan.nextInt();
//       int price = scan.nextInt();
      buy( 50, 10 );
      buy( 30, 12 );
      sell( 40, 20 );
   }
   
   public static void buy( int shares, int price )
   {
      trans.offer( new Block(shares, price) );
      
      for( Block b : trans )
         System.out.println( b );
   }
}