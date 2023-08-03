package P1_parking_lot_lld.payment;

import P1_parking_lot_lld.parking_floor.ParkingTicket;
import P1_parking_lot_lld.utils.Date;

public class PaymentReceipt {
    double amount;
    Date paymentDate;
    int transactionId;
    PaymentStatus paymentStatus;
    ParkingTicket parkingTicket;
}
