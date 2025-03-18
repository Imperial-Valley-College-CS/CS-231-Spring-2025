import java.util.GregorianCalendar;

public class GenericMethods
{
   public static void main(String[] args)
   {
      GregorianCalendar cal1 = new GregorianCalendar();
      GregorianCalendar cal2 = new GregorianCalendar();
      
      String ans1 = max("","");
      GregorianCalendar ans2 = max(cal1, cal2);      
   }
}