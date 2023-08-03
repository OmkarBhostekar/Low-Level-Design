package P1_parking_lot_lld.payment;

import P1_parking_lot_lld.parking_floor.ParkingTicket;

public class PaymentService {
    public PaymentReceipt makePayment(ParkingTicket parkingTicket, PaymentType paymentType){
        return new PaymentReceipt();
    }
}
