import javafx.scene.image.*;


public class Card
{
   private String suit, rank;
   private int value;
   private Image image;
   private ImageView imgView;
   
   public Card( String rank, String suit )
   {
      this.suit = suit;
      this.rank = rank;
      setImageView();
      setValue();
   }
   
   private void setImageView()
   {
      String filename = this.rank + "-" + this.suit+".png";
      image = new Image("/cards/"+filename);
      imgView = new ImageView(image);
   }
   
   public ImageView getImageView()
   {
      return this.imgView;
   }
   
   private void setValue()
   {
      switch( rank.toLowerCase() )
      {
         case "two": this.value = 2;break;
         case "three": this.value = 3;break;
         case "four": this.value = 4;break;
         case "five": this.value = 5;break;
         case "six": this.value = 6;break;
         case "seven": this.value = 7;break;
         case "eight": this.value = 8;break;
         case "nine": this.value = 9;break;
         case "ten": this.value = 10;break;
         case "jack": this.value = 11;break;
         case "queen": this.value = 12;break;
         case "king": this.value = 13;break;
         case "ace": this.value = 1;break;
      }
   }
   
   public void aceUp()
   {
      this.value += 10;
   }
   
   @Override
   public String toString()
   {
      return "Card: " + this.rank + " of " + this.suit
         + "\nValue: " + this.value;
   }
}