import ch.berufsbildung.vs.campus.School;
import ch.berufsbildung.vs.generators.ClassroomNameGenerator;
import ch.berufsbildung.vs.generators.GradesGenerator;
import ch.berufsbildung.vs.generators.NameGenerator;

import java.util.Random;


public class Main {

    public static void main(String[] args) {
        NamesArray namesArray = new NamesArray();
        namesArray.printValueAtIndex5();
        namesArray.printMyName();
        namesArray.printArrayLength();
        namesArray.loopThroughArray();
        namesArray.foreachLoopThroughArray();
        namesArray.printArrayValuesFromTo(2, 8);
        namesArray.printArrayValuesFromTo(4, 6);
        namesArray.printArrayValuesFromTo(8, 2);
        namesArray.printArrayValuesFromTo(4, 4);

        NumbersArray numbersArray = new NumbersArray();
        System.out.println("SumOfArray: " + numbersArray.calculateArraySum());
        System.out.println("Sum of oegative numbers: " + numbersArray.calculateArraySumOfNegativeNumbers());
        System.out.println("Sum of positive numbers: " + numbersArray.calculateArraySumOfPositiveNumbers());

        // Challenge: Arraysorting
        System.out.println("---------------------------------------------------");
        System.out.println("Challenge: Arraysorting");
        Random random = new Random();
        int randomMin = -100;
        int randomMax = 100;

        // Creating and filling an array with random numbers
        int[] randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(randomMax + 1 - randomMin) + randomMin;
            System.out.print("[" + i + "]: " + randomNumbers[i] + " ");
        }

        // We need to loop through the array at least once to see if it is sorted or not
        boolean isUnsorted = true;

        while (isUnsorted) {
            // Setting the boolean to false, next we loop through the whole array.
            // If the if-statement is true in at least one case, then we set the boolean to true again,
            // which means that we need to loop through the array again to see if it is sorted.
            // If the if-statement is once never true, then it is sorted and we leave the while-loop
            isUnsorted = false;
            for (int i = 0; i < randomNumbers.length - 1; i++) {
                if (randomNumbers[i + 1] < randomNumbers[i]) {
                    int left = randomNumbers[i];
                    randomNumbers[i] = randomNumbers[i + 1];
                    randomNumbers[i + 1] = left;
                    isUnsorted = true;
                }
            }
        }
        // Array is sorted here
        System.out.println("");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print("[" + i + "]: " + randomNumbers[i] + " ");
        }
        System.out.println("");

        // Challenge: Sum and average of array values
        System.out.println("---------------------------------------------------");
        System.out.println("Challenge: Sum and average of array values");
        randomMin = 0;
        randomMax = 100;

        // Creating and filling an array with random numbers
        randomNumbers = new int[10];
        for (int i = 0; i < randomNumbers.length; i++) {
            randomNumbers[i] = random.nextInt(randomMax + 1 - randomMin) + randomMin;
            System.out.print("[" + i + "]: " + randomNumbers[i] + " ");
        }
        System.out.println("");

        // Calculate the total sum of all values
        int sum = 0;
        double average = 0;
        for (int i = 0; i < randomNumbers.length; i++) {
            sum += randomNumbers[i];
        }
        average = sum / randomNumbers.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Challenge+: School campus
        System.out.println("Challenge+: Schoolcampus");

        // // Testing NameGenerator
        // NameGenerator nameGenerator = new NameGenerator();
        // System.out.println(nameGenerator.getRandomName().firstName);
        // System.out.println(nameGenerator.getRandomName().lastName);
        //
        // // Testing GradesGenerator
        // GradesGenerator gradesGenerator = new GradesGenerator();
        // System.out.println(gradesGenerator.getRandomBiasedGrade());
        // System.out.println(gradesGenerator.getRandomBiasedGrade());
        // System.out.println(gradesGenerator.getRandomBiasedGrade());
        // System.out.println(gradesGenerator.getRandomBiasedGrade());
        //
        // // Testing ClassroomNameGenerator
        // ClassroomNameGenerator classroomNameGenerator = new ClassroomNameGenerator();
        // System.out.println(classroomNameGenerator.getRandomClassroomName());
        // System.out.println(classroomNameGenerator.getRandomClassroomName());
        // System.out.println(classroomNameGenerator.getRandomClassroomName());

        School school = new School(32, 5, 25);
        school.initSchool();
        school.printClassroomsOverview();
        // Individual solutions:
        System.out.println(school.getAverageClassSize());


    }


}




