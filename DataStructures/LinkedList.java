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
   
   @Override
   public String toString()
   {
      Node s = this.head;     //consider that head of list is null
      String str = "[";
      while( s != null )
      {
         str += s.getElem() + " ";
         s = s.getNext();
      }
      if( str.length() > 1 )
         str = str.substring(0, str.length()-1);     //removes extra trailing space
      str += "]";
      return str;
   }
   
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
      
      public Node getNext(){ return this.next; }
      public T getElem(){ return this.elem; }      
      public boolean hasNext(){  return this.next != null; }
   }
}