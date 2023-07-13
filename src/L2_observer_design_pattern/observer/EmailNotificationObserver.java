package L2_observer_design_pattern.observer;

import L2_observer_design_pattern.observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver{

    public StockObservable observable;

    public EmailNotificationObserver(StockObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        int price = observable.getStockPrice();
        System.out.println("Sending email with updated price: "+price);
    }
}
