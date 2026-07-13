import java.util.Scanner;

public class Activity7_Matiga {
    public static void main(String[] args) {
        /*
        Kindly review and complete this activity as instructed.

        Problem Scenario:
        You are building a simple banking program where the user can:
        1. Deposit money.
        2. Withdraw money.
        3. Check balance.

        The program will:
        * Start with a balance of ₱0.
        * Allow the user to perform operations by calling methods.

        Requirements:
        Create the following methods:
        * deposit(double balance, double amount) → returns updated balance.
        * withdraw(double balance, double amount) → returns updated balance (if enough funds, otherwise print "Insufficient balance").
        * checkBalance(double balance) → prints the current balance.
         */

        // declaration of variables and scanner
        Scanner sc = new Scanner(System.in);
        int transaction;
        double balance = 0.0;

        // used do-while to loop the user in the banking system.
        do {
            // display the following commands.
            System.out.println("\n========== BANKING MENU ==========");
            System.out.println("1. Deposit money.");
            System.out.println("2. Withdraw money.");
            System.out.println("3. Check balance.");
            System.out.println("4. Exit.");
            System.out.println("==================================");

            // asked the user what kind of transaction he/she wants.
            System.out.print("\nChoose your transaction: (1-4): ");
            transaction = sc.nextInt();

            // used switch statement to perform the transaction the user wanted.
            switch (transaction) {
                case 1: // if the enter '1' the system allows it to deposit.
                    System.out.print("\nEnter Amount to Deposit: ₱");
                    double depositAmount = sc.nextDouble();

                    // checks if the amount if positive - user cannot enter a value of 0 and below.
                    if (depositAmount < 0) {
                        System.out.println("Invalid amount! Cannot deposit negative value.");
                    } else {
                        balance = deposit(balance, depositAmount);
                        System.out.printf("\nSuccessfully Deposited ₱%.2f!", depositAmount);
                        System.out.println("");
                    }
                    break;

                case 2: // if the enter '2' the system allows it to withdraw.
                    System.out.print("\nEnter Amount to Withdraw: ₱");
                    double withdrawAmount = sc.nextDouble();

                    // checks if the user has enough credits/funds in the account - cannot proceed with the transaction if non.
                    if (withdrawAmount <= 0) {
                        System.out.println("Invalid amount! Cannot withdraw zero or negative value.");
                    } else {
                        double previousBalance = balance;
                        balance = withdraw(balance, withdrawAmount);

                        if (balance != previousBalance) {
                            System.out.printf("\nSuccessfully Withdrew ₱%.2f!%n", withdrawAmount);
                        }
                    }
                    break;

                case 3: // if the enter '3' the system allows it to check the balance of the account.
                    checkBalance(balance);
                    break;

                case 4: // if the enter '4' the system allows it to exit.
                    System.out.println("Thank you for using JollyBank!");
                    break;

                default: // enter a value out of bound.
                    System.out.println("Invalid choice! Exiting program.");
                    break;
            }

            // if the user entered a number outside 1-4 the system stops.
        } while (transaction >= 1 && transaction <= 4);

        sc.close();
    }

    // deposit method.
    static double deposit(double balance, double amount) {
        return balance + amount;    // adding new amount to existing balance.
    }

    // withdraw method
    static double withdraw(double balance, double amount) {

        // the if/else statement verify that the user has enough funds to proceed in the transaction.
        if (balance >= amount) {
            return balance - amount; // if user has enough balance, the method returns the calculation.
        } else {
            System.out.println("Insufficient Amount of Balance.");
            return balance; // else returns - insufficient funds.
        }
    }

    // balance method - 'void' because it returns nothing.
    static void checkBalance(double balance) {
        System.out.printf("Current Balance: ₱%.2f%n", balance);
    }
}