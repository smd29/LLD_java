package lld.ParkingLot.dtos;

import java.time.LocalDateTime;

import lld.ParkingLot.models.VehicleType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder(toBuilder = true)
public class GetTicketDTO {
    private VehicleType vehicleType;
    private LocalDateTime entryTime;
}
