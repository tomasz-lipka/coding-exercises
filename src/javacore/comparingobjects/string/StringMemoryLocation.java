package javacore.comparingobjects.string;

/**
 * Exercise comparing the memory location of String objects using ==
 */
public class StringMemoryLocation {

    public static void main(String[] args) {
        String string1 = new String("hello"); //Java Heap
        String string2 = new String("hello"); //Java Heap
        /*
        False, because they have different memory locations - they are two different objects (created using "new").
         */
        System.out.println(string1 == string2);

        String string3 = new String("foo"); //Java Heap
        String string4 = "foo"; //Java String Pool
        /*
        False, because they have different memory locations.
         */
        System.out.println(string3 == string4);

        String string5 = "bar"; //Java String Pool
        String string6 = "bar"; //Java String Pool
        /*
        True, because identical string literals have the same memory location.
         */
        System.out.println(string5 == string6);
    }
}
