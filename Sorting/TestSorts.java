import java.util.Arrays;

public class TestSorts
{
   public static void main(String[] args)
   {
      //testArrayOfIntegers();
      //testArrayOfStudents();
      testTimeToSort();
   }
   
   public static void testTimeToSort()
   {
      int size = 100;
      while( size <= 12800 )
      {
         Integer[][] arr = createMatrix( size );    //create 100 arrays size = 100
         long t1 = System.currentTimeMillis();     //logs current time (t1)
         for( Integer[] row : arr )
            Sort.insertionSort( row );             //sorts row
         long t2 = System.currentTimeMillis();     //longs current time (t2)
         //printArrays( arr );
         double time = ( (t2-t1)/1000.0 )/100;
         System.out.printf("%d, %.5f\n", size, time );
         size *= 2;
      }
   }
   
   public static void printArrays( Integer[][] arr )
   {  
      for( Integer[] row : arr )
         System.out.println( Arrays.toString(row) );
   }
   
   public static void testArrayOfStudents()
   {
      Student s1 = new Student("Jennifer", "G0043", "7-4-2001");
      Student s2 = new Student("April", "G0017", "1-4-2004");
      Student s3 = new Student("Dragon", "G0023", "1-1-2001");
      Student s4 = new Student("Mom", "G0058", "5-13-1990");
      Student[] roster = {s1, s2, s3, s4};
      Sort.selectionSort( roster );
      for( Student s : roster )
         System.out.println( s );
   }
   
   public static void testArrayOfIntegers()   
   {
      Integer[] arr = {5, 3, 18, 21, 12, 7};
      Integer[] newArr = Sort.selectionSort( arr );
      System.out.println( Arrays.toString( newArr ) );
   }
   
   public static Integer[] randArray( int size )
   {
      Integer[] arr = new Integer[size];
      for( int i = 0; i < arr.length; i++ )
      {
         arr[i] = (int)(10*size*Math.random()) + 1;
      }
      return arr;
   }
   
   public static Integer[][] createMatrix( int size )
   {
      Integer[][] arr = new Integer[100][size];
      for( int i = 0; i < arr.length; i++ )
      {
         arr[i] = randArray( size );
      }
      return arr;
   }
}