package lld.ParkingLot.strategies.timebased;

import lld.ParkingLot.models.Ticket;

public interface FeesStrategy {
    int calculateFee(Ticket ticket);
}   
