class Cleaner implements CleanerInterface {

    @Override
    public void washDishes() {
        System.out.println("Washing the dishes");
    }

    @Override
    public void sweeping() {
        System.out.println("Sweeping the floor");
    }
}