import java.util.Scanner;

/**
 *in my store users can purchase a customized credit card
 */
public class StoreRunner {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner input = new Scanner(System.in);

        // Variables to store user choices
        String banker = "";
        boolean isVinyl = false;
        String design = "";
        String text = "";
        String material = "";

        // Prompt the user to choose a banking provider
        System.out.println("Hello! Welcome to the downtown credit card shop! " +
                           "To get started, what is your banking provider?");
        System.out.println("1: Chase");
        System.out.println("2: Wells Fargo");
        System.out.println("3: Bank of America");
        System.out.println("4: Citi");

        // Validate and process the banking provider choice
        if (input.hasNextInt()) {
            int choice = input.nextInt();
            input.nextLine(); // Clear the newline character

            // Assign the corresponding banking provider based on the user's choice
            switch (choice) {
                case 4 -> banker = "Citi";
                case 3 -> banker = "Bank of America";
                case 2 -> banker = "Wells Fargo";
                case 1 -> banker = "Chase";
                default -> {
                    System.out.println("Invalid choice. Defaulting to Chase.");
                    banker = "Chase";
                }
            }
        }

        // Ask the user about the type of card they want
        System.out.println("Thanks! Are you planning to purchase a laser-engraved card or a vinyl design card? ");
        String cardType = input.nextLine();

        // Process based on card type selection
        if (cardType.equalsIgnoreCase("vinyl")) {
            isVinyl = true;

            // Get design details for vinyl card
            System.out.println("One more thing: What design are you interested in? ");
            design = input.nextLine();
        } else {
            // Get customization details for laser-engraved card
            System.out.println("Awesome! What material are you interested in? ");
            material = input.nextLine();

            System.out.println("One more thing: What text are you planning to laser engrave onto your card? ");
            text = input.nextLine();
        }

        // Close the scanner to prevent resource leaks
        input.close();

        // Display purchase summary based on card type
        if (isVinyl) {
            Vinyl vinylCard = new Vinyl(design, banker);
            System.out.println(vinylCard);
        } else {
            Lasered laseredCard = new Lasered(text, material, banker);
            System.out.println(laseredCard);
        }
    }
}
