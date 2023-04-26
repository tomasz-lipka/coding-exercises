package javacore.trywithresources;

/**
 * Exercise using the AutoCloseable interface.
 */
public class Main {

    public static void main(String[] args) {
        try (Door door = new Door()) {
            door.open();
        }
    }
}
