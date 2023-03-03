package fibonacci;

/**
 * Exercise:
 * Write a method which returns the n-th element of the Fibonacci Sequence.
 * Few first values of the Fibonacci Sequence:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * Example: fibonacci(0) = 0, ..., fibonacci(6) = 8, ...
 * Implemented by use of a loop solution.
 */
public class FibonacciLoop {

    public int fibonacci(int index) {
        int sum = 0;
        int x1 = 0;
        int x2 = 1;

        for (int i = 0; i < index; i++) {
            sum = x1 + x2;
            x2 = x1;
            x1 = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            int fibonacci = new FibonacciLoop().fibonacci(i);
            System.out.print(fibonacci + " ");
        }
    }
}