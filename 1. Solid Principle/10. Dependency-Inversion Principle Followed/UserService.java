class UserService {
    private MySQLDatabaseInterface database;

    public UserService(MySQLDatabaseInterface database) {
        this.database = database;
    }

    public void performDatabaseOperation() {
        database.connect();
        System.out.println("Performing database operation...");
    }
}