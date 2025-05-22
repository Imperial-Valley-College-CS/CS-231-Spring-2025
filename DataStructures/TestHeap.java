public class TestHeap
{
   public static void main(String[] args)
   {
      Heap<Integer> intHeap = new Heap<>();
      intHeap.add(50);
      intHeap.add(46);
      intHeap.add(36);
      intHeap.add(31);
      intHeap.add(30);
      
      System.out.println( intHeap );      
      intHeap.removeRoot();
      System.out.println( intHeap );
   }
}