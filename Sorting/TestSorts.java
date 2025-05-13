import java.util.Arrays;

public class TestSorts
{
   public static void main(String[] args)
   {
      testArrayOfIntegers();
   }
   
   public static void testArrayOfIntegers()   
   {
      Integer[] arr = {5, 3, 18, 21, 12, 7};
      Integer[] newArr = Sort.selectionSort( arr );
      System.out.println( Arrays.toString( newArr ) );
   }
}