package lld.ParkingLot.services;

import lld.ParkingLot.models.ParkingSpot;
import lld.ParkingLot.repositories.ParkingSpotRepository;

public class ParkingSpotService {
    private ParkingSpotRepository parkingSpotRepository = new ParkingSpotRepository();

    public void markSlotBooked(ParkingSpot spot){
        parkingSpotRepository.save(spot);
    }
}
