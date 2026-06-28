class UserService {

    private EmailService emailService;

    UserService(EmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
        System.out.println("Saving user");
        emailService.emailUser(email);
    }
}