package lld.ParkingLot.strategies;

import lld.ParkingLot.models.VehicleType;

public interface FeesCalculationFactory {
    public FeesStrategy getStrategy(VehicleType vehicleType);
}
