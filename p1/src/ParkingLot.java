public class ParkingLot {

    public boolean parkVehicle(Vehicle vehicle, ParkingSpot parkingspot)
        throws UnavailableSpotException, InvalidSpotTypeException, InvalidSpotSizeException {
        if (!parkingspot.isAvailable()) {
            throw new UnavailableSpotException("Parking spot has been taken");
        } else if (parkingspot.getParkingLotType()
            .equals(ParkingSpotType.ParkingForForDisabilities)) {
            if (vehicle.getVehicleType().equals(VehicleType.VehicleForDisabilities)) {
                parkingspot.setAvailable(false);
            } else {
                throw new InvalidSpotTypeException("Vehicle is not eligible to park");
            }
        } else {
            ParkingSpotSize parkingspotSize = parkingspot.getParkingSpotSize();
            VehicleSize vehicleSize = vehicle.getVehicleSize();
            if (parkingspotSize.equals(ParkingSpotSize.Small)) {
                if (vehicleSize.equals(VehicleSize.Small)) {
                    parkingspot.setAvailable(false);
                    return true;
                } else {
                    throw new InvalidSpotSizeException("Vehicle size is not suitable for parking spot");
                }
            }

            if (parkingspotSize.equals(ParkingSpotSize.Medium)) {
                if (vehicleSize.equals(VehicleSize.Small) || vehicleSize
                    .equals(VehicleSize.Medium)) {
                    parkingspot.setAvailable(false);
                    return true;
                } else {
                    throw new InvalidSpotSizeException("Vehicle size is not suitable for parking spot");
                }
            }

            if (parkingspotSize.equals(ParkingSpotSize.Large)) {
                parkingspot.setAvailable(false);
                return true;
            }
        }
        return false;
    }
}
