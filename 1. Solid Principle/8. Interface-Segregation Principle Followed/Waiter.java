class Waiter implements WaiterInterface {

    @Override
    public void serving() {
        System.out.println("Waiter is serving food to the customers.");
    }

    @Override
    public void takeOrder() {
        System.out.println("Waiter is taking order from the customers.");
    }
}