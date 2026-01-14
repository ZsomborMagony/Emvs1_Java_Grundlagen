package ch.berufsbildung.vs.generators;

import java.util.Random;

public class GradesGenerator {
    private final Random random = new Random();


    public float getRandomBiasedGrade() {
        float grade;
        float rndValue = this.random.nextFloat();

        if (rndValue < 0.05) { // 5% chance: 1 - 2
            grade = 1 + this.random.nextFloat();
        } else if (rndValue < 0.30) { // 25% chance: 2 - 4
            grade = 2 + this.random.nextFloat() * 2;
        } else if (rndValue < 0.80) { // 50% chance: 4 - 5
            grade = 4 + this.random.nextFloat();
        } else if (rndValue < 0.95) { // 15% chance: 5 - 5.5
            grade = 5 + this.random.nextFloat() * 0.5f;

        } else { // rest chance (=5%): 5.5 - 6.0
            grade = 5.5f + this.random.nextFloat() * 0.5f;

        }
        // Round to one decimal place
        return Math.round(grade * 10) / 10f;
    }


}
