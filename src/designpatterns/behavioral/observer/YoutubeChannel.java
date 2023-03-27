package designpatterns.behavioral.observer;

public class YoutubeChannel {

    private SubscriptionManager subscriptionManager;

    public YoutubeChannel() {
        subscriptionManager = new SubscriptionManager();
    }

    public void createNewVideo(String title) {
        System.out.println("New video " + title);
        subscriptionManager.notifySubscribers("Checkout my new video " + title);
    }

    public SubscriptionManager getSubscriptionManager() {
        return subscriptionManager;
    }
}