class OrderService {

    private EmailService emailService;

    OrderService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void placeOrder(String email) {
        System.out.println("Creating user");
        emailService.emailUser(email);
    }
}