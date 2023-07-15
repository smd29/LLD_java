package lld.ParkingLot.strategies;

import lld.ParkingLot.models.Ticket;

public interface FeesStrategy {
    int calculateFee(Ticket ticket);
}   
