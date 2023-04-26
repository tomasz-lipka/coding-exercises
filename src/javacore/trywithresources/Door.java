package javacore.trywithresources;

public class Door implements AutoCloseable {

    void open() {
        System.out.println("Door opened.");
    }

    @Override
    public void close() {
        System.out.println("Door closed.");
    }
}
