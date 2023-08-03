package P1_parking_lot_lld.parking_floor;

import P1_parking_lot_lld.utils.Date;

public class ParkingTicket {
    int ticketId;
    int levelId;
    int spaceId;
    Date entryDateTime;
    Date exitDateTime;
    ParkingSpaceType parkingSpaceType;
    double totalCost;
    ParkingTicketStatus parkingTicketStatus;

    public void updateTotalCost(){}
    public void updateVehicleExitTime(Date vehicleExitTime){}
}
