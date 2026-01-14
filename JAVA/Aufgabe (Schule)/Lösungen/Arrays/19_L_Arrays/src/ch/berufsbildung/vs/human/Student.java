package ch.berufsbildung.vs.human;

public class Student {
    private final String firstName;
    private final String lastName;
    private final float[] grades;

    public Student(String firstName, String lastName, float[] grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float[] getGrades() {
        return grades;
    }
}
