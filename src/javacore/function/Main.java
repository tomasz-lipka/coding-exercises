package javacore.function;

import java.util.function.Function;

/**
 * Practise the Function interface.
 */
public class Main {

    String functionMethod(Integer integer, Function<Integer, String> lambda) {
        return lambda.apply(integer);
    }

    public static void main(String[] args) {

        //Exercise 1. - length of input String
        Function<String, Integer> function = x -> x.length();
        System.out.println(function.apply("Apply"));

        //Exercise 2. - concatenate input Integer and return String
        String result = new Main().functionMethod(7, x -> x.toString() + "seven");
        System.out.println(result);

        //Exercise 3. - Chain function
        Function<String, Integer> function1 = x -> x.length();
        Function<String, String> function2 = x -> x + "!";

        Integer inputLength = function2.andThen(function1).apply("Hello");
        System.out.println(inputLength);
    }
}
