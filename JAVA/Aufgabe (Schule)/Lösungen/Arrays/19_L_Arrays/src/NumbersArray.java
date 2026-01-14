public class NumbersArray {

    public int[] numbers = {-8, 92, 53, 24, 2, 35, -50, 77, 12, -20};

    public int calculateArraySum() {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        return result;
    }

    public int calculateArraySumOfNegativeNumbers() {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                result += numbers[i];
            }
        }
        return result;
    }

    public int calculateArraySumOfPositiveNumbers() {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                result += numbers[i];
            }
        }
        return result;
    }
}
