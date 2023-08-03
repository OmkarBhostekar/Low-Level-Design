package P1_parking_lot_lld;


import P1_parking_lot_lld.employees.ParkingAttendant;
import P1_parking_lot_lld.gates.Entrance;
import P1_parking_lot_lld.gates.Exit;
import P1_parking_lot_lld.parking_floor.ParkingFloor;
import P1_parking_lot_lld.utils.Address;
import P1_parking_lot_lld.vehicle.Vehicle;

import java.util.List;

public class ParkingLot {

    List<ParkingFloor> parkingFloors;
    List<Entrance> entrances;
    List<Exit> exits;

    Address address;
    String parkingLotName;

    public boolean isParkingSpaceAvailableForVehicle(Vehicle vehicle){ return true; }

    public boolean updateParkingAttendant(ParkingAttendant parkingAttendant, int gateId) {return true;}

}
