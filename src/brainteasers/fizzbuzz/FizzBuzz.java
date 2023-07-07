package brainteasers.fizzbuzz;

import java.util.ArrayList;

/**
 * Exercise:
 * Write a method which returns
 * 'Fizz' if a number is dividable by 3
 * 'Buzz' if a number is dividable by 5
 * 'FizzBuzz' if a number is dividable by 3 and 5
 * The number if it's not dividable by 3 nor 5
 */
public class FizzBuzz {

    private ArrayList<Fizzbuzzable> fizzbuzzables = new ArrayList<Fizzbuzzable>();

    public void add(int divider, String expression) {
        fizzbuzzables.add(new Fizzbuzzable(divider, expression));
    }

    public String fizzBuzz(int n) {
        String s = "";

        for (Fizzbuzzable f : fizzbuzzables) {
            s += f.execute(n);
        }

        if (s.isEmpty()) {
            s = Integer.toString(n);
        }
        return s;
    }

    public static void main(String[] args) {
        FizzBuzz fb = new FizzBuzz();
        fb.add(3, "Fizz");
        fb.add(5, "Buzz");

        // expected: Fizz
        System.out.println(fb.fizzBuzz(3));

        // expected: Buzz
        System.out.println(fb.fizzBuzz(5));

        // expected: FizzBuzz
        System.out.println(fb.fizzBuzz(15));

        // expected: 8
        System.out.println(fb.fizzBuzz(8));
    }
}