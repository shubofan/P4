public class ParkingSpot {

    private ParkingSpotType parkingSpotType;
    private ParkingSpotSize parkingSpotSize;
    private boolean isAvailable;

    public ParkingSpot(ParkingSpotType parkingSpotType, ParkingSpotSize parkingSpotSize, boolean isAvailable) {
        this.parkingSpotType = parkingSpotType;
        this.isAvailable = isAvailable;
        this.parkingSpotSize = parkingSpotSize;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public ParkingSpotType getParkingLotType() {
        return parkingSpotType;
    }

    public ParkingSpotSize getParkingSpotSize() {
        return parkingSpotSize;
    }

}
