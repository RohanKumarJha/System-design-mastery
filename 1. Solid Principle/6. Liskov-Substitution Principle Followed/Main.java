class Main {
    public static void main(String[] args) {
        FlyableBird eagle = new Eagle();
        eagle.fly();
        eagle.makeSound();

        Bird penguin = new Peinguin();
        penguin.makeSound();
    }
}