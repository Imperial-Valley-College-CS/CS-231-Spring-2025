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
      this.arr[this.size] = obj;
      this.size++;
   }
}