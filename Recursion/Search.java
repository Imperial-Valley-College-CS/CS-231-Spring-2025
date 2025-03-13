public class Search
{
   public static void main(String[] args)
   {
      int[] arr = {2, 5, 8, 11, 15, 21};
      //int index = search(arr, 15);
      int index = binarySearch(arr, 15);
      System.out.println( index );
   }
   
   public static int binarySearch( int[] arr, int value )
   {
      int low = 0;
      int high = arr.length-1;
      return binarySearch(arr, value, low, high);
   }
   
   public static int search(int[] arr, int value)
   {
      for( int i = 0; i < arr.length; i++)
         if( arr[i] == value )
            return i;
      return -1;
   }
   
   public static int binarySearch( int[] arr, int value, int low, int high )
   {
      if( low > high )     //value is not in array
         return -1;   
         
      int mid = (low+high)/2;
      if( value > arr[mid] )
         return binarySearch(arr, value, mid+1, high);
      if( value < arr[mid] )
         return binarySearch(arr, value, low, mid-1);
         
      
      return mid;
   }
}