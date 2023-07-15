package lld.ParkingLot.repositories;

import java.util.ArrayList;
import java.util.List;

import lld.ParkingLot.models.ParkingSpot;
import lld.ParkingLot.models.SpotStatus;
import lld.ParkingLot.models.VehicleType;

public class ParkingSpotRepository {
    List<ParkingSpot> parkingSpots = new ArrayList<>();    

    public ParkingSpot save(ParkingSpot parkingSpot){
        parkingSpots.add(parkingSpot);
        return parkingSpot;
    }

    public ParkingSpot findOneByVehicleTypeAndStatusAvailable(VehicleType type){
        for (ParkingSpot parkingSpot: parkingSpots){
            if (parkingSpot.getSpotStatus()==SpotStatus.AVAILABLE && parkingSpot.getVehicleType() == type){
                return parkingSpot;
            }
        }
    return null;
    }

}
