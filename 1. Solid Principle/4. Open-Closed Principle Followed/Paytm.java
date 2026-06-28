class Paytm implements PaymentService {
    @Override
    public void paid(double amount) {
        System.out.println("Paid " + amount + " using Paytm");
    }
}