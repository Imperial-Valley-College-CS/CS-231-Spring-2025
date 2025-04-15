public class TestHashCodes
{
   public static void main(String[] args)
   {
      System.out.println("hi".hashCode() + ", " + hashCode("hi"));
      System.out.println("low".hashCode() + ", " + hashCode("low"));
      System.out.println("daredevil".hashCode() + ", " + hashCode("daredevil") );
      System.out.println("sackboy".hashCode()+ ", " + hashCode("sackboy"));
   }
   
   public static int hashCode( String str )
   {
      int hash = 0;
      
      for( int i = 0; i < str.length(); i++ )
      {
         int a = (int)str.charAt(i);
         int b = (int)Math.pow(31,str.length()-1-i);
         System.out.println( a + ", " + b );
         hash += (a*b);
      }
      return hash;
   }
}