public class RecursiveMethods
{
   public static void main(String[] args)
   {
      for( int i = 1; i <= 10; i++ )
         System.out.printf( "%1.0f, %1.2f\n", (float)i, sumSeries(i) );
         
      System.out.println( reverse("decaf") );
      
   }
   
   public static String reverse( String str )
   {
      if( str.length() == 0 )
         return "";
      else
      {
         int lastIndex = str.length()-1;
         return str.substring(lastIndex)
            + reverse(str.substring(0,lastIndex));
      }
   }
   
   public static float sumSeries( float i )
   {
      if( i == 1 )
         return 1;
      else
         return 1.0f/i + sumSeries(i-1);
   }
   
   public static long factorial( long num )
   {
      if( num == 0 )
         return 1;
      else
         return num*factorial(num-1);
   }
}