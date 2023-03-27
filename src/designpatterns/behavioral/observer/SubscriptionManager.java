package designpatterns.behavioral.observer;

import java.util.ArrayList;

public class SubscriptionManager {
    private ArrayList<PCUser> subscribers = new ArrayList<>();

    public void subscribe(PCUser pc) {
        subscribers.add(pc);
    }

    public void unsubscribe(PCUser pc) {
        subscribers.remove(pc);
    }

    public void notifySubscribers(String message) {
        for (PCUser pcUser : subscribers) {
            pcUser.sendNotification(message);
        }
    }
}