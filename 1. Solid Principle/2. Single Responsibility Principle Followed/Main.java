class Main {
    public static void main(String[] args) {
        UserService userService = new UserService();
        userService.createUser("john_doe");

        UserEmail userEmail = new UserEmail();
        userEmail.sendEmail("john_doe@example.com");

        UserReport userReport = new UserReport();
        userReport.generateReport("User Activity Report");
    }
}