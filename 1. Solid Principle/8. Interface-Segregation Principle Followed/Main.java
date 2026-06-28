class Main {
    public static void main(String[] args) {
        ChefInterface chef = new Chef();
        chef.cooking();
        chef.chopping();

        CleanerInterface cleaner = new Cleaner();
        cleaner.washDishes();
        cleaner.sweeping();

        WaiterInterface waiter = new Waiter();
        waiter.serving();
        waiter.takeOrder();
    }
}