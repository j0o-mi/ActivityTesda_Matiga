public class Activity10_Matiga {

    static class BankAccount {
        private String accountNumber;
        private String accountHolder;
        private double balance;

        public BankAccount (String accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

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

        public void setBalance(double balance) {
            if (balance < 0) {
                System.out.println("Invalid balance. Cannot set a negative value.");
            } else {
                this.balance = balance;
            }
        }
    }

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("0123-456-7890", "John Michael", 5000.95);

//        System.out.println("=== Jelly Bank User Information ===");
//        System.out.println("Account Number: " + bankAccount.getAccountNumber());
//        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
//        System.out.println("Account Balance: " + bankAccount.getBalance());

        bankAccount.setAccountNumber("123456789");
        bankAccount.setAccountHolder("Juan Dela Cruz");
        bankAccount.setBalance(-5000.0);
        bankAccount.setBalance(5000.0);

        System.out.println("\n=== Jelly Bank User Information ===");
        System.out.println("Account Number: " + bankAccount.getAccountNumber());
        System.out.println("Account Holder: " + bankAccount.getAccountHolder());
        System.out.println("Account Balance: " + bankAccount.getBalance());
    }
}