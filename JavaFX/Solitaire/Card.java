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
      if( this.rank.equals( "BACK" ) )
         filename = "BACK.png";
         
      image = new Image("/cards/"+filename);
      imgView = new ImageView(image);
   }
   
   public Image getImage()
   {
      return this.image;
   }
   
   public ImageView getImageView()
   {
      return this.imgView;
   }
   
   private void setValue()
   {
      switch( rank.toLowerCase() )
      {
         case "2": this.value = 2;break;
         case "3": this.value = 3;break;
         case "4": this.value = 4;break;
         case "5": this.value = 5;break;
         case "6": this.value = 6;break;
         case "7": this.value = 7;break;
         case "8": this.value = 8;break;
         case "9": this.value = 9;break;
         case "10": this.value = 10;break;
         case "j": this.value = 11;break;
         case "q": this.value = 12;break;
         case "k": this.value = 13;break;
         case "a": this.value = 1;break;
         default: this.value = 0;
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