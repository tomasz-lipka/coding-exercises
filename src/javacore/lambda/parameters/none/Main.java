package javacore.lambda.parameters.none;

/**
 * Playing with a lambda no parameter implementation.
 * () -> ...
 */
class Main {

    public static void main(String[] args) {
        Kite kite = new Kite();
        kite.startFlying(
                () -> System.out.println("Uoooo I'm flying into the sky...!")
        );

        Flyable flyableLambda = () -> System.out.println("I'm flying again... whuuu!");
        kite.startFlying(flyableLambda);
    }
}
