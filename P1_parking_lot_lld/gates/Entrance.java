package P1_parking_lot_lld.gates;

import P1_parking_lot_lld.vehicle.Vehicle;
import P1_parking_lot_lld.parking_floor.ParkingTicket;

public class Entrance extends Gate {

    public ParkingTicket getParkingTicket(Vehicle vehicle){
        return new ParkingTicket();
    }

}
