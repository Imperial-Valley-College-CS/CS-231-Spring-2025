package PA9_Stacks.src.test.java;

public class TestStacks
{
   public static void main(String[] args)
   { 
      //testLargeNumberAddition();
      //testLargeNumberSubstraction();
      //testBalanceChecker();
      testPostfix();
   }
   
   public static void testPostfix()
   {
      Postfix p = new Postfix("40 2 * 3 * 5 +");
      System.out.println( p.evaluate() == 245.0 );
   }
   
   public static void testBalanceChecker()
   {
      String path = System.getProperty("user.dir");
      String filename = "TestStacks.java";
      
      BalanceChecker b = new BalanceChecker(filename);
      if( b.parse() )
         System.out.println( "Balanced: " + b.balance() );
   }
   
   public static void testLargeNumberAddition()
   {
      String expected = "18446744073709551614";
      String num1 ="9223372036854775807";
      String num2 ="9223372036854775807";
      ArithmeticOperator operate = 
         new ArithmeticOperator(num1, num2);
      
      String answer = operate.addNumbers();
      boolean passed = answer.equals(expected);   
      System.out.println( "Addition Passed: " + passed );
   }
   
   public static void testLargeNumberSubstraction()
   {  
      String expected = "-1";
      String num1 ="9223372036854775806";
      String num2 ="9223372036854775807";
      ArithmeticOperator operate = 
         new ArithmeticOperator(num1, num2);
      
      String answer = operate.subtractNumbers();
      boolean passed = answer.equals(expected);   
      System.out.println( "Subtraction Passed: " + passed );
      
      expected = "9199999999999999999";
      num1 ="9223372036854775806";
      num2 ="23372036854775807";
      operate = new ArithmeticOperator(num1, num2);
      
      answer = operate.subtractNumbers();
      passed = answer.equals(expected);   
      System.out.println( "Subtraction Passed: " + passed );
      
      expected = "-9139999999999999999";
      num1 ="83372036854775807";
      num2 ="9223372036854775806";
      operate = new ArithmeticOperator(num1, num2);
      
      answer = operate.subtractNumbers();
      passed = answer.equals(expected);   
      System.out.println( "Subtraction Passed: " + passed );
   }
}