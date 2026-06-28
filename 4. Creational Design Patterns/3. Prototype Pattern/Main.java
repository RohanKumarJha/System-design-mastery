class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Rohan","IT");
        emp1.display();

        Employee emp2 = emp1.copy("Indu","Mechanic");
        emp2.display();

        Employee emp3 = emp1.copy("Ajay","Bhikari");
        emp2.display();
    }
}