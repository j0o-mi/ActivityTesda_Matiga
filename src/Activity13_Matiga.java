// Abstract class Payment serves as a blueprint for all payment types.
// It cannot be instantiated directly — only subclasses can create objects.
abstract class Payment {

    // Abstract method: declares WHAT must be done (process a payment)
    abstract void processPayment(double amount);

    // Regular (concrete) method: has a body and is inherited by all subclasses.
    void printReceipt() {
        System.out.println("Payment has been processed.");
    }
}

// CreditCardPayment is a concrete subclass that extends Payment.
// It provides the specific implementation for processing credit card payments.
class CreditCardPayment extends Payment {

    // @Override indicates we are intentionally replacing the parent's abstract method
    // with our own implementation for credit cards.
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Credit Card Payment of ₱" + amount);
    }
}

// CashPayment is another concrete subclass that extends Payment.
// It provides its own implementation for processing cash payments.
class CashPayment extends Payment {

    // @Override: each subclass implements processPayment() differently,
    // demonstrating polymorphism through method overriding.
    @Override
    void processPayment(double amount) {
        System.out.println("Processing Cash Payment of ₱" + amount);
    }
}

public class Activity13_Matiga {
    public static void main(String[] args) {

        // Create a CreditCardPayment object.
        CreditCardPayment creditCard = new CreditCardPayment();

        // Call the overridden abstract method — credit card specific behavior.
        creditCard.processPayment(1500);

        // Call the inherited regular method from Payment — shared behavior.
        creditCard.printReceipt();

        // Create a CashPayment object.
        CashPayment cash = new CashPayment();

        // Same method name, different output = polymorphism.
        cash.processPayment(500);

        // Call the inherited regular method — same receipt for all payments.
        cash.printReceipt();
    }
}