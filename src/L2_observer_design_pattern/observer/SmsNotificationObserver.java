package L2_observer_design_pattern.observer;

import L2_observer_design_pattern.observable.StockObservable;

public class SmsNotificationObserver implements NotificationObserver{

    public StockObservable observable;

    public SmsNotificationObserver(StockObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        int price = observable.getStockPrice();
        System.out.println("Sending SMS with updated price: "+price);
    }
}
