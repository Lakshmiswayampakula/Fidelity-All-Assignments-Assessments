package assignment2.ParkingLotVehicleManagment;

public class Car extends Vehicle {
    int numDoors;

    Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Number of Doors: " + numDoors);
    }

    @Override
    double calculateParkingFee() {
        return 10.0; // Flat fee for cars
    }
}
