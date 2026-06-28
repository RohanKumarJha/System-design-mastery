class Main {
    public static void main(String[] args) {

        Eagle eagle = new Eagle();
        eagle.fly();
        eagle.sound();

        Penguin penguin = new Penguin();
        penguin.sound();
        try {
            penguin.fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}