package lld.ParkingLot.services;

import java.time.LocalDateTime;

import lld.ParkingLot.dtos.GetTicketDTO;
import lld.ParkingLot.models.ParkingSpot;
import lld.ParkingLot.models.SpotStatus;
import lld.ParkingLot.models.Ticket;
import lld.ParkingLot.models.VehicleType;

public class EntryGateService {
    ParkingSpotService parkingSpotService = new ParkingSpotService();
    SlotAllocationService slotAllocationService = new SlotAllocationService();
    TicketService ticketService = new TicketService();

    public GetTicketDTO createTicket(VehicleType vehicleType){
        ParkingSpot parkingSpot = slotAllocationService.allocateSpot(vehicleType);
        if(parkingSpot == null){
            throw new RuntimeException("Slot not available!");
        }
        parkingSpot.setSpotStatus(SpotStatus.FILLED);
        parkingSpotService.markSlotBooked(parkingSpot);

        Ticket ticket = ticketService.createTicket(vehicleType, parkingSpot);
        return GetTicketDTO.builder().entryTime(LocalDateTime.now()).vehicleType(ticket.getVehicleType()).build();
    }
}
