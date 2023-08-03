package P1_parking_lot_lld.employees;

import P1_parking_lot_lld.parking_floor.ParkingTicket;
import P1_parking_lot_lld.vehicle.Vehicle;
import P1_parking_lot_lld.payment.PaymentReceipt;
import P1_parking_lot_lld.payment.PaymentService;

public class ParkingAttendant extends Account{
    PaymentService paymentService;
    public boolean processVehicleEntry(Vehicle vehicle){
        return true;
    }
    public PaymentReceipt processPayment(ParkingTicket parkingTicket){
        return new PaymentReceipt();
    }
}
