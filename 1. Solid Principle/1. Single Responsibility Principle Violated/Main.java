class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.createUser("john_doe");
        userService.sendEmail("john_doe@example.com");
        userService.generateReport("Monthly Report");
    }
}