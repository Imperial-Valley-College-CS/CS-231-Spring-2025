import java.util.ArrayList;

public class Heap<E extends Comparable<E>>
{
   private ArrayList<E> arr = new ArrayList<>();
   
   public void add( E elem )
   {
      arr.add( elem );
      arrangeAdd();
   }
   
   private void arrangeAdd()
   {
      int index = arr.size()-1;
      int parentIndex = (index-1)/2;
      
      while( index > 0 && arr.get(index).compareTo(arr.get(parentIndex)) > 0 )
      {
         E temp = arr.get(index);
         arr.set(index, arr.get(parentIndex));
         arr.set(parentIndex, temp);
         index = parentIndex;
         parentIndex = (index-1)/2;
      }
   }
   
   public E removeRoot()
   {
      E root = this.arr.get(0);
      
      arrangeRemove();
      
      return root;
   }
   
   private void arrangeRemove()
   {
      int i = 0;
      E lastElement = this.arr.remove( this.arr.size()-1 );
      this.arr.set(i, lastElement);
      E biggerChild = getBiggerChild(i);
      
      while( biggerChild != null && this.arr.get(i).compareTo( biggerChild ) < 0 )
      {
         E temp = this.arr.get(i);
         int childIndex = this.arr.indexOf( biggerChild );
         this.arr.set(i, biggerChild );
         this.arr.set(childIndex, temp);
         i = childIndex;
         biggerChild = getBiggerChild(i);
      }
   }
   
   public E getBiggerChild( int i )
   {
      int leftChildIndex = 2*i+1;
      int rightChildIndex = 2*i+2;
      
      if( leftChildIndex < this.arr.size() && rightChildIndex < this.arr.size() )
      {
         E leftChild = this.arr.get( leftChildIndex );
         E rightChild = this.arr.get( rightChildIndex );
         return max( leftChild, rightChild );
         
      }else if( leftChildIndex < this.arr.size() )
      {
         return this.arr.get( leftChildIndex );
      }else
      {
         return null;
      }
   }
   
   public E max( E leftChild, E rightChild )
   {
      if( leftChild.compareTo( rightChild ) > 0 )
         return leftChild;
         
      return rightChild;
   }
   
   
   @Override
   public String toString()
   {
      return this.arr.toString();
   }
}