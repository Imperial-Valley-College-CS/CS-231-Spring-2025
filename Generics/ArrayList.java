import java.util.Iterator;

public class ArrayList<E> implements Iterable
{
   E[] arr;
   int size = 0;
   
   public ArrayList()
   {
      arr = (E[])(new Object[2]);      //initial number of elements
   }
   
   public void add( E obj )
   {
      if( size == arr.length )
         resize();
      arr[size] = obj;
      size++;
   }
   
   public void add( int index, E obj )
   {
      if( size == arr.length )
         resize();
         
      for( int i = size; i > index; i-- )
         arr[i] = arr[i-1];
      
      arr[index] = obj;
      size++;
   }
   
   public E remove( int index )
   {
      E elem = arr[index];    //store element to be removed and returned
      size--;
      
      for( int i = index; i < size; i++ )    //shift elements 1 space to the left
         arr[i] = arr[i+1];
         
      arr[size] = null;    //set last element in list to null
      return elem;
   }
   
   public E get( int index )
   {
      if( index >= size )
         throw new ArrayIndexOutOfBoundsException();
         
      return arr[index];
   }
   
   private void resize()      //called when arr is full
   {
      E[] newArr = arr;                   //newArr has all elements in arr
      arr = (E[])(new Object[2*size]);    //lose all the elements in arr
      
      for( int i = 0; i < size; i++ )
         arr[i] = newArr[i];              //copy over elements from newArr into arr
   }
   
   @Override
   public Iterator<E> iterator()
   {
      return new ListIterator<E>(this);
   }
   
   class ListIterator<E> implements Iterator<E>
   {
      int index = 0;
      E elem;
      ArrayList<E> list;
      
      public ListIterator(ArrayList<E> list)
      {
         this.list = list;
         elem = this.list.get(index);
      }
      
      @Override
      public boolean hasNext()
      {
         try
         {
            E next = this.list.get(index);
            if( next != null )
               return true;
               
            return false;
         }catch( ArrayIndexOutOfBoundsException e )
         {
            return false;
         }
         
      }
      
      @Override
      public E next()
      {
         E current = this.list.get(index);
         index++;
         return current;
      }
   
   }
}