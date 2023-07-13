package L2_observer_design_pattern.observer;

import L2_observer_design_pattern.observable.StockObservable;

public class EmailNotificationObserver implements NotificationObserver{

    public StockObservable observable;
    public String email;

    public EmailNotificationObserver(String email,StockObservable observable) {
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        int price = observable.getStockPrice();
        System.out.println("Sending email to " + this.email +" with updated price: "+price);
    }
}
