/**
  * Lasered class contains functions if user chooses a laser engraved card
 */
public class Lasered {

    // The price of the laser-engraved card
    private double price = 49.99;

    // The material of the credit card (e.g., metal, plastic)
    private String material;

    // The text to be laser-engraved on the card
    private String text;

    // The banking provider associated with the card
    private String bankingProvider;

    /**
     * Constructor to initialize a Lasered object with specified text, material, and banking provider
     */
    public Lasered(String text, String material, String bankingProvider) {
        this.text = text;
        this.material = material;
        this.bankingProvider = bankingProvider;
    }

    /**
     * Retrieves the engraved text on the card
     */
    public String getText() {
        return text;
    }

    /**
     * Retrieves the material of the card
     */
    public String getMaterial() {
        return material;
    }

    /**
     * Updates the material of the card
     */
    public void setMaterial(String newMaterial) {
        material = newMaterial;
    }

    /**
     * Updates the engraved text on the card.
     */
    public void setText(String newText) {
        text = newText;
    }

    /**
     * Provides a summary of the order details
     */
    public String toString() {
        return "\nThank you for your purchase! You are ordering a " + material +
               " credit card with the text \"" + text + "\" laser engraved.\n" +
               "You selected " + bankingProvider + " as your banking provider.\n" +
               "Your total is $" + price + ".\nEnjoy your new card!";
    }
}
