package lld.ParkingLot.services;

import java.time.LocalDateTime;

import lld.ParkingLot.models.ParkingSpot;
import lld.ParkingLot.models.Ticket;
import lld.ParkingLot.models.VehicleType;
import lld.ParkingLot.repositories.TicketRepository;

public class TicketService {
    private TicketRepository ticketRepository = new TicketRepository();

    public Ticket createTicket(VehicleType vehicleType, ParkingSpot parkingSpot){
        Ticket ticket = Ticket.builder().entryTime(LocalDateTime.now()).floorNo(parkingSpot.getFloorNo()).spotNo(parkingSpot.getSpotId()).build();
        return ticketRepository.save(ticket);
    }
}
