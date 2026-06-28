class Eagle implements FlyableBird {
    @Override
    public void fly() {
        System.out.println("Eagle is flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Eagle sound");
    }
}