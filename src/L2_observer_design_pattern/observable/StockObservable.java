package L2_observer_design_pattern.observable;

import L2_observer_design_pattern.observer.NotificationObserver;

public interface StockObservable {

    public void add(NotificationObserver observer);

    public void remove(NotificationObserver observer);

    public void notifySubscribers();

    public void setStockPrice(int price);

    public int getStockPrice();

}
