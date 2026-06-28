class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new Paytm();
        paymentService.paid(100.0);

        paymentService = new PhonePe();
        paymentService.paid(200.0);

        paymentService = new BharatPay();
        paymentService.paid(300.0);
    }
}