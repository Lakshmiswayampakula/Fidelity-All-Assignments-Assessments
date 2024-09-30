package assignment2.ParkingLotVehicleManagment;

public class ParkingLotVehicle {
    public static void main(String[] args) {
        Car car = new Car("CAR123", "Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("MOTO456", "Honda", "V-Twin");

        System.out.println("Car Information:");
        car.displayVehicleInfo();
        System.out.println("Parking Fee: $" + car.calculateParkingFee());

        System.out.println("\nMotorcycle Information:");
        motorcycle.displayVehicleInfo();
        System.out.println("Parking Fee: $" + motorcycle.calculateParkingFee());
    }
}
