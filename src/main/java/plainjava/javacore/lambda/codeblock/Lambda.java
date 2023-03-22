package plainjava.javacore.lambda.codeblock;

class Lambda {

    public static void main(String[] args) {
        Kite kite = new Kite();
        String isFast = kite.isMyKiteFast(
                (speed) -> {
                    if (speed > 5) {
                        return "yes";
                    } else {
                        return "no";
                    }
                }
        );
        System.out.println(isFast);

        Flyable flyableLambda = s -> {
            String describe = s > 1 ? "is" : "isn't";
            return "My kite " + describe + " fast";
        };
        String speedAgain = kite.isMyKiteFast(flyableLambda);
        System.out.println(speedAgain);
    }
}
