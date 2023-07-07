package brainteasers.fizzbuzz;

/**
 * This class allows to create a custom expression for a number and its divider
 * It makes the FizzBuzz exercise adhere to the open-closed principle
 */
public class Fizzbuzzable {

    private int divider;
    private String expression;

    public Fizzbuzzable(int divider, String expression) {
        this.divider = divider;
        this.expression = expression;
    }

    public String execute(int number) {
        if (dividesBy(number, this.divider)) {
            return this.expression;
        }
        return "";
    }

    private boolean dividesBy(int number, int divider) {
        return number % divider == 0;
    }
}
