package lld.ParkingLot.strategies.timebased;

import lld.ParkingLot.models.VehicleType;

public interface FeesCalculationFactory {
    public FeesStrategy getStrategy(VehicleType vehicleType);
}
