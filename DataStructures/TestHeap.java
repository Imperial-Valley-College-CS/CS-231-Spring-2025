public class TestHeap
{
   public static void main(String[] args)
   {
      Heap<Integer> intHeap = new Heap<>();
      intHeap.add(50);
      intHeap.add(35);
      intHeap.add(42);
      intHeap.add(12);
      intHeap.add(2);
      intHeap.add(6);
      
      System.out.println( intHeap );
      
      intHeap.add(60);
      
      System.out.println( intHeap );
      
      
      intHeap.add(40);
      
      System.out.println( intHeap );
      
      intHeap.removeRoot();
   }
}