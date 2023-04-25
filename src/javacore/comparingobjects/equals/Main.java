package javacore.comparingobjects.equals;

/**
 * Exercise comparing two objects using equals().
 */
public class Main {
    public static void main(String[] args) {
        /*
         Expected result: false.
         Because Cup uses the default implementation of equals() from the Object class.
         They have two different memory locations.
         */
        Cup firstCoffee = new Cup("coffee");
        Cup secondCoffee = new Cup("coffee");
        System.out.println(firstCoffee.equals(secondCoffee));

        /*
         Expected result: true.
         A record has hashCode() and equals() already implemented.
         */
        Phone myFirstPhone = new Phone("iPhone");
        Phone mySecondPhone = new Phone("iPhone");
        System.out.println(myFirstPhone.equals(mySecondPhone));

        /*
        Expected result: true.
        Because hashCode() and equals() have been implemented.
         */
        Watch myFirstWatch = new Watch("Certina");
        Watch mySecondWatch = new Watch("Certina");
        System.out.println(myFirstWatch.equals(mySecondWatch));
    }
}
