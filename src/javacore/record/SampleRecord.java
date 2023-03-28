package javacore.record;

public record SampleRecord(long id, String name)
        /*records can't extend any other class
        extends Main
        */

        //but it can implement interfaces
        implements Runnable {

    /*instance field are not allowed:
    private String instanceField;
     */

    //but static field are allowed:
    public static final String staticField = "STATIC_FIELD";

    //compact constructor overrides the default (canonical) constructor
    public SampleRecord {
        if (id <= 0) {
            throw new IllegalArgumentException("id may not be negative");
        }
    }

    public void instanceMethod() {
        System.out.println("I'm an instance method on a record");
    }

    public static void staticMethod() {
        System.out.println("I'm a static method on a record");
    }

    @Override
    public void run() {

    }
}
