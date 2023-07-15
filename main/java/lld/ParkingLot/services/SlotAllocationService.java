package lld.ParkingLot.services;

import lld.ParkingLot.models.ParkingSpot;
import lld.ParkingLot.models.VehicleType;
import lld.ParkingLot.repositories.ParkingSpotRepository;

public class SlotAllocationService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public ParkingSpot allocateSpot(VehicleType vehicleType){
        return parkingSpotRepository.findOneByVehicleTypeAndStatusAvailable(vehicleType);
    }
}
