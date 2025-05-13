

public class Sort
{
   public static <E extends Comparable<E>> E[] selectionSort( E[] arr )
   {
      for( int i = 0; i < arr.length-1; i++ )
      {
         E temp = arr[i];
         int k = findSmallest( arr, i );  //location of smallest element
         arr[i] = arr[k];     //place smallest element at i
         arr[k] = temp;       //place ith element where smallest was
      }
      return arr;
   }
   
   public static <E extends Comparable<E>> int findSmallest( E[] arr, int start)
   {
      E smallest = arr[start];
      int index = start;
      for( int i = start + 1; i < arr.length; i++ )
      {  
         if( arr[i].compareTo(smallest) < 0 )
         {
            smallest = arr[i];
            index = i;
         }
      }
      return index;
   }
}