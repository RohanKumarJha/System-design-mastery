class Penguin implements Bird {
    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins cannot fly");
    }
    @Override
    public void sound() {
        System.out.println("Penguin is screeching");
    }
}