package lld.ParkingLot.strategies.timebased;

import lld.ParkingLot.models.VehicleType;
import lld.ParkingLot.strategies.FeesCalculationFactory;
import lld.ParkingLot.strategies.FeesStrategy;

public class TimeBasedFeesStrategyFactory implements FeesCalculationFactory{

    @Override
    public FeesStrategy getStrategy(VehicleType vehicleType) {
        switch(vehicleType) {
            case Small:

            case Large:
            case Medium:
                throw new RuntimeException("Not implemented");
        }
        throw new RuntimeException("Invalid type");
    }
    
}
