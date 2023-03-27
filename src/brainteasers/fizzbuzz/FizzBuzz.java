package brainteasers.fizzbuzz;

/**
 * Exercise:
 * Write a method which returns
 * 'Fizz' if a number is dividable by 3
 * 'Buzz' if a number is dividable by 5
 * 'exercises.FizzBuzz' if a number is dividable by 3 and 5
 * The number if it's not dividable by 3 nor 5
 */
public class FizzBuzz {

    public String fizzBuzz(Integer i) {
        StringBuilder stringBuilder = new StringBuilder();
        if (dividesBy(i, 3)) {
            stringBuilder.append("Fizz");
        }
        if (dividesBy(i, 5)) {
            stringBuilder.append("Buzz");
        }
        if (!(dividesBy(i, 3) || dividesBy(i, 5))) {
            stringBuilder.append(i);
        }
        return stringBuilder.toString();
    }

    private boolean dividesBy(int number, int divider) {
        return number % divider == 0;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(3)); //Fizz
        System.out.println(fizzBuzz.fizzBuzz(5)); //Buzz
        System.out.println(fizzBuzz.fizzBuzz(15)); //exercises.FizzBuzz
        System.out.println(fizzBuzz.fizzBuzz(1)); //1
    }
}