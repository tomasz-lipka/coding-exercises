package javacore.lambda.parameters.two;

/**
 * Playing with a lambda multiple parameter implementation.
 * (x, y) -> ...
 */
class Main {

    public static void main(String[] args) {
        Kite kite = new Kite();
        kite.startFlying(
                (p, s) -> System.out.println(p + "Uoooo I'm flying into the sky...!" + s)
        );

        Flyable flyableLambda = (p, s) -> System.out.println(p + "I'm flying again... whuuu!" + s);
        kite.startFlying(flyableLambda);
    }
}
