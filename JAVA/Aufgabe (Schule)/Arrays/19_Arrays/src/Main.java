public class Main {
    public static void main(String[] args) {
        NamesArray namestest = new NamesArray();
        namestest.printValueAtIndex5();
        namestest.printMyName();
        System.out.println(namestest.names[0]);
        namestest.printArrayLength();
        namestest.loopThroughArray();
        namestest.foreachLoopThroughArray();
        namestest.printArrayValuesFromTo();

        NumbersArray numbersArray = new NumbersArray();

        numbersArray.calculateArraySum();
        numbersArray.calculateArraySumOfNegativeNumbers();




    }
}
