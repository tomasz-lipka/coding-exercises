package javacore.lambda.returnvalue;

/**
 * Playing with a lambda implementation which returns a value
 */
class Main {

    public static void main(String[] args) {
        Kite kite = new Kite();
        String returnValue = kite.startFlying(
                s -> "Uoooo I'm flying into the sky...!" + s
        );
        System.out.println(returnValue);

        Flyable flyableLambda = s -> "I'm flying again... whuuu!" + s;
        String returnValueAgain = kite.startFlying(flyableLambda);
        System.out.println(returnValueAgain);
    }
}
