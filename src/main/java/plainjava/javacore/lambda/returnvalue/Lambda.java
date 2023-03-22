package plainjava.javacore.lambda.returnvalue;

class Lambda {

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
