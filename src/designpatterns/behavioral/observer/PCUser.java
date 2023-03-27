package designpatterns.behavioral.observer;

public class PCUser implements Subscription {

    private String name;

    public PCUser(String name) {
        this.name = name;
    }

    @Override
    public void sendNotification(String message) {
        System.out.println(name + " received message: " + message);
    }
}