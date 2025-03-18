import java.util.GregorianCalendar;

public class GenericMethods
{
   public static void main(String[] args)
   {
      GregorianCalendar cal1 = new GregorianCalendar(2025, 2, 18);
      GregorianCalendar cal2 = new GregorianCalendar(2004, 9, 13);
      Student s1 = new Student("Joe", 21, "G00193932", "3-18-2000");
      Student s2 = new Student("Lisa", 19, "G00122202", "7-12-2004");
      
      String ans1 = max("hulk","spider-man");
      GregorianCalendar ans2 = max(cal1, cal2);   
      Student ans3 = max(s1, s2);
      System.out.println( ans1 );   
      System.out.println( ans3 );
      System.out.println( ans2 );
   }
   
   public static <E extends Comparable<? super E>> E max(E obj1, E obj2)
   {
      if( obj1.compareTo(obj2) > 0 )
         return obj1;
      else
         return obj2;
   }
}