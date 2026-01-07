public class NumbersArray {
    int[] numbers = new int[10];

    public NumbersArray() {
        numbers[0] = -8;
        numbers[1] = 92;
        numbers[2] = 53;
        numbers[3] = 24;
        numbers[4] = 2;
        numbers[5] = 35;
        numbers[6] = -50;
        numbers[7] = 77;
        numbers[8] = 12;
        numbers[9] = -20;
    }

    public void calculateArraySum () {
            int sum = 0;
            for (int n : numbers) {
                sum += n;
        }
        System.out.println(sum);
    }

    public void calculateArraySumOfNegativeNumbers () {
        System.out.println(numbers[0] + numbers[6] + numbers[9]);
    }
}
