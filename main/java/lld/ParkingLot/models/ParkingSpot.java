package lld.ParkingLot.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParkingSpot extends BaseModel{
    private Integer spotId;
    private Integer floorNo;
    private VehicleType vehicleType;
    private SpotStatus spotStatus;
}
