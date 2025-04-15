import java.util.*;

public class TestingSets
{
   public static void main(String[] args)
   {
      //testHashSet();
      //testLinkedHashSet();
      testTreeSet();
   }
   
   public static void testHashSet()
   {
      //Create a hash set
      Set<String> set = new HashSet<>();
      
      //Add strings to the set
      set.add("London");
      set.add("Paris");
      set.add("New York");
      set.add("San Francisco");
      set.add("Beijing");
      set.add("New York");      //added again, but not stored in set
      
      System.out.println( set );
      
      // Display the elements in the hash set
      for( String s : set )
      {
        System.out.print(s.toUpperCase() + " " );
      }
      
      //Process the elements using a forEach method
      System.out.println();
      set.forEach( e -> System.out.print(e.toLowerCase() + " " ));
   }
   
   public static void testLinkedHashSet()
   {
      //Create a linked hash set
      Set<String> set = new LinkedHashSet<>();
      
      //Add strings to the set
      set.add("London");
      set.add("Paris");
      set.add("New York");
      set.add("San Francisco");
      set.add("Beijing");
      set.add("New York");      //added again, but not stored in set
      
      System.out.println( set );
      
      // Display the elements in the hash set
      for( String s : set )
      {
        System.out.print(s.toLowerCase() + " " );
      }
   }
   
   public static void testTreeSet()
   {
      //Create a hash set
      Set<String> set = new HashSet<>();
      
      set.add("London");
      set.add("Paris");
      set.add("New York");
      set.add("San Francisco");
      set.add("Beijing");
      set.add("New York");
      
      TreeSet<String> treeSet = new TreeSet<>(set);
      System.out.println("Sorted tree set: " + treeSet );
      
      System.out.println("first(): " + treeSet.first() );
      System.out.println("last(): " + treeSet.last() );
   }
}