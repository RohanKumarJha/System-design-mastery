class Employee {
    private String name;
    private String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public Employee copy(String name,String department) {
        return new Employee(name, department);
    }

    public void display() {
        System.out.println(name + " " + department);
    }
}