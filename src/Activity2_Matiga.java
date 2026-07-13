import java.util.Scanner;

public class Activity2_Matiga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        You are creating a program for a small movie ticket booth.
        The price of the ticket depends on the customer’s age:
        - Below 5 years old → Free
        - 5–12 years old → ₱100
        - 13–59 years old → ₱200
        - 60 years old and above → ₱150 (senior discount)
        */

        // declaration of variables - prices per age category according to the guidelines/task.
        double priceFree = 0.00;
        double priceChild = 100.00;
        double priceAdult = 200.00;
        double priceSenior = 150.00;

        // Asking the user to input information.
        System.out.println("=== Movie Ticket Booth ===");
        System.out.print("Enter Customer's Name: ");
        String customerName = sc.nextLine();

        System.out.print("Enter Customer's Age: ");
        int customerAge = sc.nextInt();
        sc.nextLine();

        // conditional statement (using if/else) used to display output,
        // categorized by the age of the user.
        if (customerAge < 5) {
            System.out.println("\n=== Movie Ticket Receipt ===");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Age: " + customerAge);
            System.out.println("Ticket Price: " + priceFree);
            System.out.println("You are free of Charge!");
        } else if (customerAge >= 5 && customerAge <= 12) {
            System.out.println("\n=== Movie Ticket Receipt ===");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Age: " + customerAge);
            System.out.println("Ticket Price: " + priceChild);
        } else if (customerAge >= 13 && customerAge <= 59) {
            System.out.println("\n=== Movie Ticket Receipt ===");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Age: " + customerAge);
            System.out.println("Ticket Price: " + priceAdult);
        } else {
            System.out.println("\n=== Movie Ticket Receipt ===");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Age: " + customerAge);
            System.out.println("Ticket Price: " + priceSenior);
        }

        // final message..
        System.out.println("Enjoy Watching!");
    }
}