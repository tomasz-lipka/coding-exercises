package plainjava.designpatterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        YoutubeChannel youtubeChannel = new YoutubeChannel();

        PCUser tom = new PCUser("Tom");
        youtubeChannel.getSubscriptionManager().subscribe(tom);

        PCUser leo = new PCUser("Leo");
        youtubeChannel.getSubscriptionManager().subscribe(leo);

        youtubeChannel.createNewVideo("'How to Java'");
    }
}