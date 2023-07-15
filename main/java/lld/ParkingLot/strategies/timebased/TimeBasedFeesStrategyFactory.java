package lld.ParkingLot.strategies.timebased;

import lld.ParkingLot.models.VehicleType;
import lld.ParkingLot.strategies.FeesCalculationFactory;
import lld.ParkingLot.strategies.FeesStrategy;

public class TimeBasedFeesStrategyFactory implements FeesCalculationFactory{

    @Override
    public FeesStrategy getStrategy(VehicleType vehicleType) {
        switch(vehicleType) {
            case Small:
                return new SmallVehicleTimeStrategy();
            case Large:
                return new LargeVehicleTimeStrategy();
            case Medium:
                return new MediumVehicleTimeStrategy();
        }
        throw new RuntimeException("Invalid type");
    }
    
}
