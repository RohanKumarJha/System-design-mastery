class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("credit", 100.0);
        paymentService.processPayment("debit", 50.0);
    }
}