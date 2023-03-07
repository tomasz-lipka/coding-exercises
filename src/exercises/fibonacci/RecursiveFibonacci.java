package exercises.fibonacci;

/**
 * Exercise:
 * Write a method which returns the n-th element of the Fibonacci Sequence.
 * Few first values of the Fibonacci Sequence:
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ...
 * Example: exercises.fibonacci(0) = 0, ..., exercises.fibonacci(6) = 8, ...
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
