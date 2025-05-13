import java.util.Arrays;

public class Sort
{
   public static void main(String[] args)
   {
      int[] arr = {5, 3, 8, 21, 34, 7};
      int[] newArr = sort( arr );
      System.out.println( Arrays.toString( newArr ) );
   }
   public static int[] sort( int[] arr )
   {
      //sort array and then return
      return arr;
   }
   
   public static int findSmallest( int[] arr, int start)
   {
      int smallest = arr[start];
      int index = start;
      for( int i = start + 1; i < arr.length; i++ )
      {  
         if( arr[i] < smallest )
         {
            smallest = arr[i];
            index = i;
         }
      }
      return index;
   }
}