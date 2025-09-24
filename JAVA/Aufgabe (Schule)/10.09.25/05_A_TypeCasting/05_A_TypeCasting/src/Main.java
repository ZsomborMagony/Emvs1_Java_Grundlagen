public class Main {
    public static void main(String[] args) {
        //--------------------------------------------------------------------------------------------------------------
        // 1. Declare variables for all primitive data types except boolean. Initialize them with appropriate values.
        // Perform type casting operations as follows:
        //      a. Start with the smallest range data type.
        //      b. Cast this type to every other type with a larger range.
        //      c. Repeat this process for each data type, always casting to types with larger ranges.
        // For each casting operation:
        //      If the cast is valid (widening conversion), perform the operation.
        //      If the cast is invalid or requires an explicit cast (narrowing conversion), write the code but comment it out.


        // Your code here

        byte a = 126;
        short b = 20000;
        int c = 120000;
        long d = 834863468134861L;
        float e = 1.2345f;
        double f = 2.8787878787d;
        char g = 61;

        a = (byte) b;
        c = b;
        d = b;
        e = b;
        f = b;
        g = (char) b;

        System.out.println(g);

        a = (byte) c;
        b = (short) c;
        d = c;
        e = c;
        f = c;
        g = (char) c;

        System.out.println(g);

        a = (byte) d;
        b = (short) d;
        c = (int) d;
        e = d;
        f = d;
        g = (char) d;

        System.out.println(g);

        a = (byte) e;
        b = (short) e;
        c = (int) e;
        d = (long) e;
        f = e;
        g = (char) e;

        System.out.println(g);

        a = (byte) f;
        b = (short) f;
        c = (int) f;
        d = (long) f;
        e = (float) f;
        g = (char) f;

        System.out.println(g);

        a = (byte) g;
        b = (short) g;
        d = g;
        e = g;
        f = g;

        System.out.println(f);




                //--------------------------------------------------------------------------------------------------------------
        // 2. Now create a long with the value = 1234567890.
        //    Manually cast the long to an int and print it out

        // Your code here

        long myLong = 1234567890;
        int myInt = (int) myLong;
        System.out.println(myInt);

        //--------------------------------------------------------------------------------------------------------------
        // 3. Try to guess what the following code is doing:

        String myNumber = "33";
        int intNumber = 10;

        myNumber += intNumber;
        System.out.println(myNumber);

        // Try to guess first what happens, then test it.
        // System.out.println(myNumber);

        // Can you explain what is happening?

        // Vielleicht weil man das myNumber "33" eine text ist wird es nicht zum das Zahl addiert sonder das 10 wird nach der 33 geschrieben

        //--------------------------------------------------------------------------------------------------------------
        // 4. Below is a line commented out, because it is throwing an error.
        //    What is the error and why does it happen?
        //    Try to figure out, how you could convert a String-value to an int.
        //    PS: You need to look it up in the internet.
        //    You might want to try following search term: "java string to int"
        //    Check with the System.out.println if you are actually printing an int


        String houseNumberInString = "52";
        int houseNumber = Integer.parseInt(houseNumberInString);
        System.out.println(houseNumber);

        //--------------------------------------------------------------------------------------------------------------
        // 5. Write down what could go wrong with your solution above

        // Write down here
        // Maybe the System might write "Integer" als "Integr" and that will give a warning.

    }
}