package fibonacci;

/**
 * Returns the n-th element of the Fibonacci Sequence.
 * The Fibonacci Sequence is the series of numbers in which each number is the sum of the two preceding ones.
 * Few first values:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * Assuming that indexes start at zero: fibonacci(0) = 0, ..., fibonacci(6) = 8, ...
 * Implemented by use of a recurrent solution.
 */
public class RecursiveFibonacci {

    public int run(int index) {
        return fibonacci(index, 0, 1);
    }

    private int fibonacci(int index, int x1, int x2) {
        if (index != 0) {
            index--;
            return fibonacci(index, x2, x1 + x2);
        }
        return x1;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 13; i++) {
            int fibonacci = new RecursiveFibonacci().run(i);
            System.out.print(fibonacci + " ");
        }
    }
}
