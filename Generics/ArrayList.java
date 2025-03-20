public class ArrayList<E>
{
   //create an array to store all elements of arraylist
   private E[] arr;
   private int size = 0;
   
   //constructor
   public ArrayList()
   {
      this.arr = (E[])(new Object[2]);   //default initial size of array
   }
   
   public ArrayList(int size)
   {
      this.arr = (E[])(new Object[size]);   //user-defined initial size of array
   }
   
   public void add(E obj)
   {
      if( this.size == arr.length )    //check if arr is full
         resize();
         
      this.arr[this.size] = obj;
      this.size++;
   }
   
   public void add(E obj, int index)
   {
      if( this.size == arr.length )    //check if arr is full
         resize();
         
      for( int i = size; i > index; i-- )  //shifts elements one space to left
         this.arr[i] = arr[i-1];
         
      this.arr[index] = obj;     //insert element at specified index
      this.size++;               
   }
   
   private void resize()
   {
      E[] newArr = (E[])(new Object[arr.length*2]);
      for(int i = 0; i < this.size; i++)
      {
         newArr[i] = this.arr[i];
      }
      this.arr = newArr;
   }
}