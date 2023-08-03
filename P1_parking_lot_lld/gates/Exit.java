package P1_parking_lot_lld.gates;

import P1_parking_lot_lld.parking_floor.ParkingTicket;
import P1_parking_lot_lld.payment.PaymentType;

public class Exit extends Gate {

    public ParkingTicket payForParking(ParkingTicket parkingTicket, PaymentType paymentType){
        return new ParkingTicket();
    }

}
