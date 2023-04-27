package javacore.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Exercising the consumer functional interface and forEach iteration.
 * The Consumer accept() method takes one argument and returns void.
 */
public class Main {

    public static void main(String[] args) {
        Consumer<String> consumerImplementation = x -> System.out.print(x + ", ");
        consumerImplementation.accept("accept");

        System.out.println();

        List<String> list = Arrays.asList("one", "two", "three");
        list.forEach(consumerImplementation);
    }
}
