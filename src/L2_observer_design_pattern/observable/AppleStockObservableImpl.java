package L2_observer_design_pattern.observable;

import L2_observer_design_pattern.observer.NotificationObserver;

import java.util.ArrayList;
import java.util.List;

public class AppleStockObservableImpl implements StockObservable{

    public List<NotificationObserver> observers = new ArrayList<>();
    public int stockPrice = 0;

    @Override
    public void add(NotificationObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationObserver obj: observers) {
            obj.update();
        }
    }

    @Override
    public void setStockPrice(int price) {
        this.stockPrice = price;
        notifySubscribers();
    }

    @Override
    public int getStockPrice() {
        return this.stockPrice;
    }
}
