package javacore.record;

/**
 * Playing with a record class.
 */
public class Main {

    public static void main(String[] args) {
        SampleRecord sampleRecord = new SampleRecord(123, "myName");

        //record fields are final and there are no setter methods. Only getters (without the 'get' prefix)
        System.out.println(sampleRecord.id());

        //toString() is defined (likewise hashCode() and equals())
        System.out.println(sampleRecord);

        //instance and static methods can be created
        sampleRecord.instanceMethod();
        SampleRecord.staticMethod();

        //check usage of a compact constructor
        SampleRecord compactRecord = new SampleRecord(-1, "expects error");
    }
}
