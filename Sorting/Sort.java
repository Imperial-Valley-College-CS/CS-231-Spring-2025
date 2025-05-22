import java.util.Arrays;

public class Sort
{
   public static void main(String[] args)
   {
      int[] arr = {20, 11, 33, 16}; //, 46}; // 13, 100, 9, 54, 78, 87, 25, 1, 48};
      long t1 = System.currentTimeMillis();
      bogoSort( arr );
      long t2 = System.currentTimeMillis();
      System.out.println( t2 - t1 );
   }

   public static int[] bogoSort( int[] arr )
   {
      boolean sorted = false;
      
      while( !sorted )
      {
         //sorted = true;
         shuffle( arr );
         System.out.println( Arrays.toString(arr) );
         sorted = checkSorted( arr );
      }
      return arr;
   }
   
   public static void shuffle( int[] arr )
   {
      for (int i = 1; i < arr.length; i++)
         swap(arr, i, (int)(Math.random() * i));
   }
   
   public static void swap(int[] a, int i, int j)
   {
       int temp = a[i];
       a[i] = a[j];
       a[j] = temp;
   }
   
   public static boolean checkSorted( int[] arr )
   {
      for( int i = 1; i < arr.length; i++ )
      {
         if( arr[i-1] > arr[i] )    //check if previous element is bigger than current element
            return false;
      }
      return true;
   }
   
   public static <E extends Comparable<E>> E[] insertionSort( E[] arr ){

		//traverse array from second element to end
		for( int i = 1; i < arr.length; i++){

			E unsortedElement = arr[i]; //store unsorted element (it will be lost when shifting happens)
			int k;
			/* traverse sorted sublist right-to-left until:
			* kth element is not greater than unsorted element or
			* start of list is reached */
			for( k = i-1; k >= 0 && arr[k].compareTo(unsortedElement) > 0; k-- ){
				arr[k+1] = arr[k];   //shift sorted elements one spot to the right
			}
			arr[k+1] = unsortedElement;   //insert unsorted element into sorted sublist
		}
    return arr;
	}
   
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