package lld.ParkingLot.services;

import lld.ParkingLot.models.Ticket;
import lld.ParkingLot.strategies.FeesStrategy;
import lld.ParkingLot.strategies.FeesStrategyFactory;

public class FeeCalculationService {
    private static final String PRICING_SCHEME = "TimeBased";

    public Integer calculateFee(Ticket ticket){
        FeesStrategy feesStrategy = FeesStrategyFactory.getFactory(PRICING_SCHEME).getStrategy(ticket.getVehicleType());
        return feesStrategy.calculateFee(ticket);
    }
}
