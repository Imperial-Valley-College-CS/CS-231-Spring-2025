import java.util.GregorianCalendar;

public class GenericMethods
{
   public static void main(String[] args)
   {
      GregorianCalendar cal1 = new GregorianCalendar(2025, 2, 18);
      GregorianCalendar cal2 = new GregorianCalendar(2004, 9, 13);
      Student s1 = new Student("Joe", "G00193932", "3-26-2000");
      Student s2 = new Student("Lisa", "G00122202", "7-12-2004");
      
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
   
   public static <E extends Comparable<E>> void sort(E[] arr)
   {
      int n = arr.length;
      for (int i = 1; i < n; ++i) {
         E key = arr[i];
         int j = i - 1;
   
         /* Move elements of arr[0..i-1], that are
         greater than key, to one position ahead
         of their current position */
         while (j >= 0 && arr[j].compareTo(key) > 0) {
            arr[j + 1] = arr[j];
            j = j - 1;
         }
         arr[j + 1] = key;
      }
   }
}