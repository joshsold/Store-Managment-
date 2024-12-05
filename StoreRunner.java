import java.util.Scanner;

public class StoreRunner {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String banker = "";
        boolean isVinyl = false;
        String design = "";
        String text = "";
        String material = "";

        System.out.println("Hello! Welcome to the downtown credit card shop! To get started, what is your banking provider?");
        System.out.println("1: Chase");
        System.out.println("2: Wells Fargo");
        System.out.println("3: Bank of America");
        System.out.println("4: Citi");

        if (input.hasNextInt()) {
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 4) {
                banker = "Citi";
            } else if (choice == 3) {
                banker = "Bank of America";
            } else if (choice == 2) {
                banker = "Wells Fargo";
            } else if (choice == 1) {
                banker = "Chase";
            } else {
                System.out.println("Invalid choice. Defaulting to Chase.");
                banker = "Chase";
            }
        }

        System.out.println("Thanks! Are you planning to purchase a laser-engraved card or a vinyl design card? ");
        String cardType = input.nextLine();

        if (cardType.equals("vinyl")) {
            isVinyl = true;
            System.out.println("One more thing: What design are you interested in? ");
            design = input.nextLine();
        } else {
            System.out.println("Awesome! What material are you interested in? ");
            material = input.nextLine();
            System.out.println("One more thing: What text are you planning to laser engrave onto your card? ");
            text = input.nextLine();
        }

        input.close();

        if (isVinyl) {
            Vinyl vinylCard = new Vinyl(design, banker);
            System.out.println(vinylCard);
        } else {
            Lasered laseredCard = new Lasered(text, material, banker);
            System.out.println(laseredCard);
        }
    }
}