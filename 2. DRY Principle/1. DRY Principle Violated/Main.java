class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.registerUser("join.doe@gmail.com");

        OrderService orderService = new OrderService();
        orderService.placeOrder("join.doe@gmail.com");
    }
}