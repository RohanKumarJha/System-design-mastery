class Main {
    public static void main(String[] args) {
        MySQLDatabaseInterface mySQLDatabase = new MySQLDatabase();
        mySQLDatabase.connect();

        UserService userService = new UserService(mySQLDatabase);
        userService.performDatabaseOperation();
    
    }
}