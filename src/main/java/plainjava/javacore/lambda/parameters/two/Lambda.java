package plainjava.javacore.lambda.parameters.two;

class Lambda {

    public static void main(String[] args) {
        Kite kite = new Kite();
        kite.startFlying(
                (p, s) -> System.out.println(p + "Uoooo I'm flying into the sky...!" + s)
        );

        Flyable flyableLambda = (p, s) -> System.out.println(p + "I'm flying again... whuuu!" + s);
        kite.startFlying(flyableLambda);
    }
}
