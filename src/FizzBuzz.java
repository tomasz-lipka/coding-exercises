/**
 * Write a method that returns 'Fizz' for multiples of three and 'Buzz' for the multiples of five.
 * For numbers which are multiples of both three and five return 'FizzBuzz'.
 * For numbers that are neither, return the input number.
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
        System.out.println(fizzBuzz.fizzBuzz(15)); //FizzBuzz
        System.out.println(fizzBuzz.fizzBuzz(1)); //1
    }
}