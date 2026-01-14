
public class NamesArray {

    public String[] names = new String[10];

    public NamesArray() {
        names[0] = "Primis";
        names[1] = "Jony";
        names[2] = "Hannes";
        names[3] = "Laura";
        names[4] = "Sven";
        names[5] = "Mariel";
        names[6] = "Leo";
        names[7] = "Anna";
        names[8] = "Fabian";
        names[9] = "Nicole";
        names[0] = "Primus";
    }

    public void printValueAtIndex5() {
        System.out.println("Task 5");
        System.out.println(names[5]); // Mariel
    }

    // Task 12-e
    public void printMyName() {
        System.out.println("Task 6");
        System.out.println(names[1]); // Jony
    }

    public void printArrayLength() {
        System.out.println("Task 8");
        System.out.println("Array length: " + names.length); // 10
    }

    public void loopThroughArray() {
        System.out.println("Task 9");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }

    public void foreachLoopThroughArray() {
        System.out.println("Task 10");
        for (String name : names) {
            System.out.println(name);
        }
    }

    public void printArrayValuesFromTo(int startPos, int endPos) {
        System.out.println("Task 11");
        if (startPos < endPos) {
            for (int i = startPos; i < endPos; i++) {
                System.out.println(names[i]);
            }
        } else if (startPos > endPos) {
            for (int i = startPos; i > endPos; i--) {
                System.out.println(names[i]);
            }
        } else {
            System.out.println("Start position can’t be the same as end position!");
        }

    }
}
