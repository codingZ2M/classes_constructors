package behavioral.design.patterns.observer;

import java.util.*;

// The Subject
public class Stock {
    private String name;
    private double price;
    private List<Observer> observers = new ArrayList<>();

    public Stock(String name, double initialPrice) {
        this.name = name;
        this.price = initialPrice;
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void setPrice(double newPrice) {
        if (newPrice != this.price) {
            this.price = newPrice;
            notifyObservers();
        }
    }

    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(name, price);
        }
    }
}

