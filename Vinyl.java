/*
 * 
 */
public class Vinyl {
private double price = 59.99;
  private String design;
  private String text;
    private String bankingProvider;
public Vinyl(String design, String bankingProvider){
  this.design = design;
  this.bankingProvider = bankingProvider;
}

public String getBankingProvider(){
  return bankingProvider;
}
  public String getDesign(){
  return design;
}
  public void setDesign(String newDesign){
   design = newDesign; 
  }
   public void setBankingProvider(String newBakingProvider){
   bankingProvider = newBakingProvider; 
  }
  public String toString() {
  return "\n Thank you for your purchase! You are ordering a vinyl credit card with a " + design + " design and you selected " + bankingProvider + " as your banking provider.\n" + 
    "Your total is " + price + ".\n Enjoy your new card!";
}}
  