import java.util.Scanner;

public class Activity3_Matiga {
    public static void main(String[] args) {
        /*
        Problem Scenario:
        You are making a simple menu-driven program for a snack shop.
        The user selects a menu number, and the program will display the corresponding snack name and price.

        Menu:
        1 → Burger – ₱50
        2 → Fries – ₱40
        3 → Soda – ₱20
        4 → Ice Cream – ₱35

        If the user enters a number that’s not in the menu, display "Invalid choice".
         */
        Scanner sc = new Scanner(System.in);

        // Declaration of Variables - Item/Snack Prices
        int snackPrice = 0;

        // Display the Menu for the user.
        System.out.println("=== Snack Menu ===");
        SnackMenu();

        // Scanner - use to ask the user what the order is.
        System.out.print("\nWhat would you like to order? ");
        String choice = sc.nextLine();

        // Conditional Statement - used Switch Statement to print the output.
        switch (choice.toLowerCase()) {
            case "burger":
                snackPrice = 50;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", snackPrice);
                break;
            case "fries":
                snackPrice = 40;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", snackPrice);
                break;
            case "soda":
                snackPrice = 20;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", snackPrice);
                break;
            case "ice cream":
                snackPrice = 35;
                System.out.println("\n=== Snack Receipt ====");
                System.out.println("You have chosen: " + choice);
                System.out.printf("Price: ₱%d%n", snackPrice);
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    // Snack Menu Method - Reusable Data for printing the Snack Menu..
    static void SnackMenu() {
        System.out.println("1. Burger - ₱50");
        System.out.println("2. Fries - ₱40");
        System.out.println("3. Soda - ₱20");
        System.out.println("4. Ice Cream - ₱35");
    }
}