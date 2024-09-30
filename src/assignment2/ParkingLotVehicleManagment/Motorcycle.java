package assignment2.ParkingLotVehicleManagment;

public class Motorcycle extends Vehicle {
    String engineType;

    Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    void displayVehicleInfo() {
        super.displayVehicleInfo();
        System.out.println("Engine Type: " + engineType);
    }

    @Override
    double calculateParkingFee() {
        return 5.0; // Flat fee for motorcycles
    }
}
