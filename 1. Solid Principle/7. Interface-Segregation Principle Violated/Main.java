class Main {
    public static void main(String[] args) {
        HotelManagement hotelManagement = new Chef();
        hotelManagement.cooking();
        hotelManagement.chopping();
        hotelManagement.washDishes();
        hotelManagement.sweeping();
        hotelManagement.serving();
        hotelManagement.takeOrder();

        hotelManagement = new Waiter();
        hotelManagement.cooking();
        hotelManagement.chopping();
        hotelManagement.washDishes();
        hotelManagement.sweeping();
        hotelManagement.serving();
        hotelManagement.takeOrder();

        hotelManagement = new Cleaner();
        hotelManagement.cooking();
        hotelManagement.chopping();
        hotelManagement.washDishes();
        hotelManagement.sweeping();
        hotelManagement.serving();
        hotelManagement.takeOrder();
    }
}