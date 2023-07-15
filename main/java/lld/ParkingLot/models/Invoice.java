package lld.ParkingLot.models;

import java.sql.Time;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Invoice extends BaseModel{
    private String invoideId;
    private Time exitTime;
    private String ticketId;
    private Ticket ticket;
    private double amount;
    private String paymentId;
    private Payment payment;
}
