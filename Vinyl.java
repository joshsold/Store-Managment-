/**
 * The Vinyl class represents a custom-designed credit card with a vinyl finish
 * It includes properties for the design, text, banking provider, and price
 * It provides methods to access and modify these properties
 */
public class Vinyl {

    // The price of the vinyl credit card
    private double price = 59.99;

    // The design of the vinyl card 
    private String design;

    // The banking provider associated with the card
    private String bankingProvider;

    /**
     * Constructor to initialize a Vinyl object with a specified design and banking provider
     */
    public Vinyl(String design, String bankingProvider) {
        this.design = design;
        this.bankingProvider = bankingProvider;
    }

    /**
     * Retrieves the banking provider associated with the card
     */
    public String getBankingProvider() {
        return bankingProvider;
    }

    /**
     * Retrieves the design of the vinyl card
     */
    public String getDesign() {
        return design;
    }

    /**
     * Updates the design of the vinyl card
     */
    public void setDesign(String newDesign) {
        design = newDesign;
    }

    /**
     * Updates the banking provider for the card
     */
    public void setBankingProvider(String newBankingProvider) {
        bankingProvider = newBankingProvider;
    }

    /**
     * Provides a summary of the order details
     */
    public String toString() {
        return "\nThank you for your purchase! You are ordering a vinyl credit card with a " + design +
               " design and you selected " + bankingProvider + " as your banking provider.\n" +
               "Your total is $" + price + ".\nEnjoy your new card!";
    }
}
