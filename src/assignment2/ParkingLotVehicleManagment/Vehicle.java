package assignment2.ParkingLotVehicleManagment;

public class Vehicle {
    // Base class
    String registrationNumber;
    String brand;

    Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    void displayVehicleInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }

    double calculateParkingFee() {
        return 0.0;
    }
}
