import java.util.*;

public class Constants
{
   public static double canWid = 1300;
   public static double canHei = 600;
   public static double cardWid = 100;
   public static double cardHei = cardWid*726.0/500.0;
   public static String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
   public static String[] suits = {"C","D","H","S"};
   public static HashSet<Card> deck = new HashSet<>();
}