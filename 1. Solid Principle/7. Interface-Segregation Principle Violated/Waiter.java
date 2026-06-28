class Waiter implements HotelManagement {
    @Override
    public void cooking() {
        // Not applicable for Waiter
    }

    @Override
    public void chopping() {
        // Not applicable for Waiter
    }

    @Override
    public void washDishes() {
        // Not applicable for Waiter
    }

    @Override
    public void sweeping() {
        // Not applicable for Waiter
    }

    @Override
    public void serving() {
        System.out.println("Waiter is serving food to the customers.");
    }

    @Override
    public void takeOrder() {
        System.out.println("Waiter is taking order from the customers.");
    }
}