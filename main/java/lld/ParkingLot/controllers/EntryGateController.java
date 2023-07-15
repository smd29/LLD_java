package lld.ParkingLot.controllers;

import lld.ParkingLot.dtos.GetTicketDTO;
import lld.ParkingLot.models.VehicleType;
import lld.ParkingLot.services.EntryGateService;

public class EntryGateController {
    EntryGateService entryGateService = new EntryGateService();
    public GetTicketDTO createTicket(VehicleType vehicleType) {
        return entryGateService.createTicket(vehicleType);
    }
}
