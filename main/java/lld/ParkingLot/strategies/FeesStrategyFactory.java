package lld.ParkingLot.strategies;

import lld.ParkingLot.strategies.dynamic.DynamicFeesFactory;
import lld.ParkingLot.strategies.timebased.TimeBasedFeesStrategyFactory;

public class FeesStrategyFactory {
    
    public static FeesCalculationFactory getFactory(String priceScheme){
        switch(priceScheme){
            case "TimeBased":
                return new TimeBasedFeesStrategyFactory();
            case "Dynamic":
                return new DynamicFeesFactory();
        }
        return null;
    }
}
