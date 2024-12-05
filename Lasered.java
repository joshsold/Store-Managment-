/*
 * 
 */
public class Lasered {
private double price = 49.99;
private String material;
private String text;
private String bankingProvider;

public Lasered(String text, String material, String bankingProvider){
  this.text = text;
  this.material = material;
  this.bankingProvider = bankingProvider;
}

  public String getText(){
  return text;
}
  public String getMaterial(){
  return material;
}
  public void setMaterial(String newMaterial){
   material = newMaterial; 
  }
  public void setText(String newText){
  text = newText;
  }
  
  public String toString() {
  return "\n Thank you for your purchase! You are ordering a " + material + " credit card with the text " + text + " laser engraved.\n You selected " + 
    bankingProvider + " as your banking provider.\n" + "Your total is " + price + ".\n Enjoy your new card!";
}
}
  