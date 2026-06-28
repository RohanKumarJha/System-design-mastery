class Main {
    public static void main(String[] args) {

        EmailService emailService = new EmailService();

        UserService userService = new UserService(emailService);
        userService.registerUser("join.doe@gmail.com");

        OrderService orderService = new OrderService(emailService);
        orderService.placeOrder("join.doe@gmail.com");
    }
}