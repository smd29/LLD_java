package lld.ParkingLot.repositories;

import java.util.ArrayList;
import java.util.List;

import lld.ParkingLot.models.Ticket;

public class TicketRepository {
    private List<Ticket> tickets = new ArrayList<>();
    
    public Ticket save(Ticket ticket){
        tickets.add(ticket);
        return ticket;
    }
}
