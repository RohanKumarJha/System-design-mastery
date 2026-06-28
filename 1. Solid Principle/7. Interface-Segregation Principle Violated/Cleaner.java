class Cleaner implements HotelManagement {
    @Override
    public void cooking() {
        // Not applicable for Cleaner
    }

    @Override
    public void chopping() {
        // Not applicable for Cleaner
    }

    @Override
    public void washDishes() {
        System.out.println("Washing the dishes");
    }

    @Override
    public void sweeping() {
        System.out.println("Sweeping the floor");
    }

    @Override
    public void serving() {
        // Not applicable for Cleaner
    }

    @Override
    public void takeOrder() {
        // Not applicable for Cleaner
    }
}