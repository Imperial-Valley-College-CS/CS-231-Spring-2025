import java.util.Arrays;

public class TestSorts
{
   public static void main(String[] args)
   {
      //testArrayOfIntegers();
      testArrayOfStudents();
   }
   
   public static void testArrayOfStudents()
   {
      Student s1 = new Student("Jennifer", "G0043", "7-4-2001");
      Student s2 = new Student("April", "G0017", "1-4-2004");
      Student s3 = new Student("Dragon", "G0023", "1-1-2001");
      Student s4 = new Student("Mom", "G0058", "5-13-2025");
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
}