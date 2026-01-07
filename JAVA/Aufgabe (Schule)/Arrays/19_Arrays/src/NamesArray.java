public class NamesArray {
    String[] names = new String[10];
    public NamesArray () {

        names[0] = "Primis";
        names[1] = "Zsombor";
        names[2] = "Roger";
        names[3] = "Buck";
        names[4] = "Adam";
        names[5] = "Peter";
        names[6] = "Andy";
        names[7] = "Irene";
        names[8] = "Cross";
        names[9] = "Kyle";

        names[0] = new String("Primus");
    }

    public void printValueAtIndex5() {
        System.out.println(this.names[5]);
    }

    public void printMyName() {
        System.out.println(this.names[1]);
    }

    public void printArrayLength() {
        System.out.println(names.length);
    }

    public void loopThroughArray() {
        for (int integrator = 0; integrator < names.length; integrator++) {
            System.out.println("[" + integrator + "]" + names[integrator]);
            }
    }

    public void foreachLoopThroughArray() {
        for (String name : names) {
            System.out.println(name);
        }

    }

    public void printArrayValuesFromTo () {
        for (int i = 2; i <= names.length - 2; i++) {
            System.out.println(names[i]);
        }
    }
}
