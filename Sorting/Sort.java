import java.util.Arrays;

public class Sort
{
   public static void main(String[] args)
   {
      int[] arr = {5, 3, 18, 21, 12, 7};
      int[] newArr = sort( arr );
      System.out.println( Arrays.toString( newArr ) );
      System.out.println( findSmallest( arr, 2 ) );
   }
   public static int[] sort( int[] arr )
   {
      for( int i = 0; i < arr.length-1; i++ )
      {
         int temp = arr[i];
         int k = findSmallest( arr, i );  //location of smallest element
         arr[i] = arr[k];     //place smallest element at i
         arr[k] = temp;       //place ith element where smallest was
      }
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