class UserService {
    private MySQLDatabase database;

    public UserService(MySQLDatabase database) {
        this.database = database;
    }

    public void performDatabaseOperation() {
        database.connect();
        System.out.println("Performing database operation...");
    }
}