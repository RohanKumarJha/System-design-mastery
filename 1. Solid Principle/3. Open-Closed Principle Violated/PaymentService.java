class PaymentService {
    public void processPayment(String type, double amount) {
        if (type.equals("credit")) {
            System.out.println("Processing credit payment of $" + amount);
        } else if (type.equals("debit")) {
            System.out.println("Processing debit payment of $" + amount);
        } else {
            throw new IllegalArgumentException("Unsupported payment type: " + type);
        }

        
    }
}