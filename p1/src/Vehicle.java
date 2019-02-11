public class Vehicle {

    public Vehicle(VehicleSize vehicleSize, VehicleType vehicleType) {
        this.vehicleSize = vehicleSize;
        this.vehicleType = vehicleType;
    }

    public VehicleSize getVehicleSize() {
        return vehicleSize;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    private VehicleSize vehicleSize;

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    private VehicleType vehicleType;
}
