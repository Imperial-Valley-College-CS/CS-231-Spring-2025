import java.util.*;
import java.util.concurrent.TimeUnit;

public class Student implements Comparable<Student>
{
   //no main method
   //This class is a template for creating Student objects   
   //data fields
   private String name, id;
   private GregorianCalendar dob;
   private int age;
   private double gpa;  
   
   //constructor(s)   
   public Student(String n, String g, String dob)
   {
      this.name = n;
      this.id = g;
      setDOB( dob );
      setAge();
   }
   
   private void setAge()
   {
      GregorianCalendar today = new GregorianCalendar();
      long time1 = today.getTimeInMillis();
      long time2 = this.dob.getTimeInMillis();
      long diff = time1 - time2;
      this.age = (int)(TimeUnit.MILLISECONDS.toDays(diff)/365.2422);
      System.out.println( this.age );      
   }
   
   private void setDOB( String dob )   //expected dob format: 7-3-2005
   {
      String[] tokens = dob.split("-");
      int month = Integer.parseInt( tokens[0] ) - 1;  //0-january
      int day = Integer.parseInt( tokens[1] );
      int year = Integer.parseInt( tokens[2] );
      this.dob = new GregorianCalendar(year, month, day);
      //System.out.println( this.dob.get(Calendar.YEAR) );
   }
   
   //methods 
   public int getAge(){ return this.age; };
   public GregorianCalendar getDOB(){ return this.dob; }
   
   @Override
   public int compareTo(Student s)
   {
      return this.dob.compareTo( s.getDOB() );
   }
      
   @Override
   public String toString()
   {
      return "Name: " + this.name + "\nAge: " + this.age;
   }
}