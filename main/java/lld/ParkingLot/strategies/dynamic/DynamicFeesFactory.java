package lld.ParkingLot.strategies.dynamic;

import lld.ParkingLot.models.VehicleType;
import lld.ParkingLot.strategies.FeesCalculationFactory;
import lld.ParkingLot.strategies.FeesStrategy;

public class DynamicFeesFactory implements FeesCalculationFactory{

    @Override
    public FeesStrategy getStrategy(VehicleType vehicleType) {
        switch(vehicleType) {
            case Small:
                return new SmallVehicleDynamicStrategy();
            case Large:
            case Medium:
                throw new RuntimeException("Not implemented");
        }
        throw new RuntimeException("Invalid type");
    }
    
}
