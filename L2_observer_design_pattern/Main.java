package L2_observer_design_pattern;

import L2_observer_design_pattern.observable.AppleStockObservableImpl;
import L2_observer_design_pattern.observer.EmailNotificationObserver;
import L2_observer_design_pattern.observer.SmsNotificationObserver;

public class Main {
    public static void main(String[] args) {
        // create observable object
        AppleStockObservableImpl appleStockObservable = new AppleStockObservableImpl();
        // create observers
        EmailNotificationObserver emailNotificationObserver1 = new EmailNotificationObserver("omkar@gmail.com",appleStockObservable);
        EmailNotificationObserver emailNotificationObserver2 = new EmailNotificationObserver("om@gmail.com",appleStockObservable);
        SmsNotificationObserver smsNotificationObserver = new SmsNotificationObserver("9812345670", appleStockObservable);

        // subscribe to observable
        appleStockObservable.add(emailNotificationObserver1);
        appleStockObservable.add(emailNotificationObserver2);
        appleStockObservable.add(smsNotificationObserver);
        appleStockObservable.setStockPrice(50);

        // unsubscribe
        appleStockObservable.remove(emailNotificationObserver1);
        appleStockObservable.setStockPrice(100);

        appleStockObservable.remove(smsNotificationObserver);
        appleStockObservable.setStockPrice(500);
    }
}
