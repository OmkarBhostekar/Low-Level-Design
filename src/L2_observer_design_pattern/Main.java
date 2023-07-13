package L2_observer_design_pattern;

import L2_observer_design_pattern.observable.AppleStockObservableImpl;
import L2_observer_design_pattern.observer.EmailNotificationObserver;
import L2_observer_design_pattern.observer.SmsNotificationObserver;

public class Main {
    public static void main(String[] args) {
        // create observable object
        AppleStockObservableImpl appleStockObservable = new AppleStockObservableImpl();
        // create observers
        EmailNotificationObserver emailNotificationObserver = new EmailNotificationObserver(appleStockObservable);
        SmsNotificationObserver smsNotificationObserver = new SmsNotificationObserver(appleStockObservable);

        // subscribe to observable
        appleStockObservable.add(emailNotificationObserver);
        appleStockObservable.add(smsNotificationObserver);
        appleStockObservable.setStockPrice(50);

        // unsubscribe
        appleStockObservable.remove(emailNotificationObserver);
        appleStockObservable.setStockPrice(100);

        appleStockObservable.remove(smsNotificationObserver);
        appleStockObservable.setStockPrice(500);
    }
}
