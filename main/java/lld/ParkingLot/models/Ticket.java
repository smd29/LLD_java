package lld.ParkingLot.models;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class Ticket extends BaseModel{
    private String ticketId;
    private String vehicleId;
    private Integer spotNo;
    private Integer floorNo;
    private VehicleType vehicleType;
    private LocalDateTime entryTime;
    private LocalDateTime exitDateTime;
    private TicketStatus ticketStatus;
}
