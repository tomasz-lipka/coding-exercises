package plainjava.brainteasers;

/**
 * Exercise:
 * Implement a method which calculates the factorial of a given number.
 * Example:
 * 3! = 1*2*3 = 6
 * 4! = 24
 * 7! = 5040
 */
public class Factorial {

    public int calculate(int x) {
        return factorial(x, x);
    }

    private int factorial(int x, int counter) {
        counter--;
        if (counter == 1) {
            return x;
        }
        return factorial(x * counter, counter);
    }

    public static void main(String[] args) {
        System.out.println(new Factorial().calculate(7));
    }
}
