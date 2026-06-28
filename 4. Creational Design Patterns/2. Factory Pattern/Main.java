class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = VehicleFactory.getVehicle("Bike");
        vehicle1.start();

        Vehicle vehicle2 = VehicleFactory.getVehicle("Car");
        vehicle2.start();
    }
}