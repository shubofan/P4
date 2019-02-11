public class main {
    public static void main(String[] args)
        throws UnavailableSpotException, InvalidSpotTypeException, InvalidSpotSizeException {
        ParkingSpot parkingSpot = new ParkingSpot(ParkingSpotType.Regular, ParkingSpotSize.Small, true);
        Vehicle vehicle = new Vehicle(VehicleSize.Medium, VehicleType.Regular);
        ParkingLot p = new ParkingLot();
        try {
            System.out.println(p.parkVehicle(vehicle, parkingSpot));
        } catch (InvalidSpotSizeException e) {
            e.printStackTrace();
            System.out.println(parkingSpot.isAvailable());

        }

    }
}
