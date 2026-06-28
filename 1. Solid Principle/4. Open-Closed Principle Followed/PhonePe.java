class PhonePe implements PaymentService {
    @Override
    public void paid(double amount) {
        System.out.println("Paid " + amount + " using PhonePe");
    }
}