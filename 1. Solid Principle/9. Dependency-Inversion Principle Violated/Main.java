class Main {
    public static void main(String[] args) {
        MySQLDatabase mySQLDatabase = new MySQLDatabase();
        mySQLDatabase.connect();

        UserService userService = new UserService(mySQLDatabase);
        userService.performDatabaseOperation();
    
    }
}