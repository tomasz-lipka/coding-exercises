package javacore.lambda.parameters.one;

class Lambda {

    public static void main(String[] args) {
        Kite kite = new Kite();
        kite.startFlying(
                s -> System.out.println("Uoooo I'm flying into the sky...!" + s)
        );

        Flyable flyableLambda = s -> System.out.println("I'm flying again... whuuu!" + s);
        kite.startFlying(flyableLambda);
    }
}
