package fibonacci;

/**
 * Returns the n-th element of the Fibonacci Sequence.
 * The Fibonacci Sequence is the series of numbers in which each number is the sum of the two preceding ones.
 * Few first values:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * Assuming that indexes start at zero: fibonacci(0) = 0, ..., fibonacci(6) = 8, ...
 * Implemented by use of a recurrency solution.
 *
 * @author Tomasz Lipka
 */
public class RecursiveFibonacci {
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, .
    public int fibonacci(int index, int x1, int x2) {
        index--;
        if (index != 0) {
            return fibonacci(index, x2, x1 + x2);
        }
        return x1 + x2;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 14; i++) {
            int fibonacci = new RecursiveFibonacci().fibonacci(i, 0, 1);
            System.out.print(fibonacci + " ");
        }

        System.out.println();
        int fibonacci = new RecursiveFibonacci().fibonacci(6, 0, 1);
        System.out.print(fibonacci + " ");
    }
}
