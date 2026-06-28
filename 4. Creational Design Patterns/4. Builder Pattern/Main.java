class Main {
    public static void main(String[] args) {
        Student student = new Student.Builder()
        .setAge(28)
        .setName("Adi")
        .setCourse("LLB")
        .build();
        student.display();
    }
}