import java.util.Arrays;

public class TestSorts
{
   public static void main(String[] args)
   {
      //testArrayOfIntegers();
      //testArrayOfStudents();
      
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