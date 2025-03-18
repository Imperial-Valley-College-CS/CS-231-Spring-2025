import java.util.*;

public class Student
{
   //no main method
   //This class is a template for creating Student objects   
   //data fields
   private String name, id;
   private GregorianCalendar dob;
   private int age;
   private double gpa;
   private Major major;
   private ArrayList<Course> courses = new ArrayList<>();   
   
   //constructor(s)   
   public Student(String n, int a, String g, String dob)
   {
      this.name = n;
      this.age = a;
      this.id = g;
      setDOB( dob );
   }
   
   private void setDOB( String dob )   //expected dob format: 7-3-2005
   {
      String[] tokens = dob.split("-");
      int month = Integer.parseInt( tokens[0] ) - 1;  //0-january
      int day = Integer.parseInt( tokens[1] );
      int year = Integer.parseInt( tokens[2] );
      this.dob = new GregorianCalendar(year, month, day);
      System.out.println( this.dob.get(Calendar.YEAR) );
   }
   
   //methods 
   public void setMajor(Major m)
   {
      this.major = m;
   }
   
   public void addCourse(Course c)
   {
      this.courses.add(c);
   }
   
   public void addCourse(int index, Course c)
   {
      this.courses.add(index, c);
   }
   
   @Override
   public String toString()
   {
      return "Name: " + this.name + "\nAge: " + this.age;
   }
}