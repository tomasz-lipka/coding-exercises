package fibonacci;

/**
 * Returns the n-th element of the Fibonacci Sequence.
 * The Fibonacci Sequence is the series of numbers in which each number is the sum of the two preceding ones.
 * Few first values:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * Assuming that indexes start at zero: fibonacci(0) = 0, fibonacci(1) = 1, ...
 * Implemented by use of a loop solution.
 *
 * @author Tomasz Lipka
 */
public class FibonacciLoop {
    public int fibonacci(int index) {
        int sum = index;
        int last = 1;
        int beforeLast = 0;
        //zroibc last i current

        for (int i = 1; i < index; i++) {
            sum = beforeLast + last;
            beforeLast = last;
            last = sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 14; i++) {
            int fibonacci = new FibonacciLoop().fibonacci(i);
            System.out.print(fibonacci + " ");
        }
//        System.out.println(new fibonacci.FibonacciNumber().fibonacci(4));
    }
}