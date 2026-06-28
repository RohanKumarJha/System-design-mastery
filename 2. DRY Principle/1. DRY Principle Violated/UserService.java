class UserService {
    public void registerUser(String email) {
        System.out.println("Saving user");

        // Duplicate
        System.out.println("Connecting to database");
        System.out.println("Sending welcome mail to : "+email);
    }
}