public class Activity10_Matiga {

    // creation of Bank Account Class that stores the data of user.
    static class BankAccount {

        // private fields - encapsulation hides the data from outside access.
        private String accountNumber;
        private String accountHolder;
        private double balance;

        public BankAccount (String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        // getter/setter - used to access the private fields from outside.
        public String getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(String accountNumber) {
            this.accountNumber = accountNumber;
        }

        public String getAccountHolder() {
            return accountHolder;
        }

        public void setAccountHolder(String accountHolder) {
            this.accountHolder = accountHolder;
        }

        public double getBalance() {
            return balance;
        }

        // important instruction - add a validation on the balance setter.
        // make sure that the user cannot set a negative value.
        public void setBalance(double balance) {
            if (balance < 0) {
                System.out.println("Invalid balance. Cannot set a negative value.");
            } else {
                this.balance = balance;
            }
        }
    }

    public static void main(String[] args) {

        // default value of "bank account"
        BankAccount bankAccount = new BankAccount("0123-456-7890", "John Michael", 5000.95);

        // getter
//        System.out.println("=== Jelly Bank User Information ===");
//        System.out.println("Account Number: " + bankAccount.getAccountNumber());
//        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
//        System.out.println("Account Balance: " + bankAccount.getBalance());

        // assigning new values using setters.
        bankAccount.setAccountNumber("123456789");
        bankAccount.setAccountHolder("Juan Dela Cruz");

        bankAccount.setBalance(-5000.0);    // test: displays the warning.
        bankAccount.setBalance(5000.0);     // displays this instead the negative value.

        // display value of setters using getters.
        System.out.println("\n=== Jelly Bank User Information ===");
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
        System.out.println("Account Balance: " + bankAccount.getBalance());
    }
}