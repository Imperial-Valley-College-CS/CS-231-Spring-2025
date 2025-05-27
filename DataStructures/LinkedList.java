public class LinkedList<T>
{
   private int size = 0;
   private Node head = null;
   private Node tail = null;      
   
   public void add( T elem )     //add element at end of list
   {
      if( this.size == 0 )
      {
         head = new Node( elem, null );
         tail = head;
      }else
      {      
         Node newNode = new Node( elem, null );       //create new Node that will be tail
         this.tail.setNext( newNode );                //have current tail point to new Node
         this.tail = newNode;                         //reset tail to point to new Node
      }
      this.size++;   
   }
   
   public int size(){ return this.size; }
   
   class Node
   {
      T elem;
      Node next;
      
      public Node( T elem, Node next )
      {
         this.elem = elem;
         this.next = next;
      }
      
      public void setNext( Node next )
      {
         this.next = next;
      }
   }
}