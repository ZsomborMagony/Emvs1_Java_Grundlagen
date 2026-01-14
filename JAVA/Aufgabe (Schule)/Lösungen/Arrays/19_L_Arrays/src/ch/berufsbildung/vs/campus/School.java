package ch.berufsbildung.vs.campus;

import ch.berufsbildung.vs.generators.ClassroomNameGenerator;
import ch.berufsbildung.vs.generators.GradesGenerator;
import ch.berufsbildung.vs.generators.NameGenerator;
import ch.berufsbildung.vs.human.Student;
import ch.berufsbildung.vs.human.Teacher;

import java.util.Random;

public class School {

    private final int amountOfClassrooms;
    private final int minStudentsPerClassroom;
    private final int maxStudentsPerClassroom;

    private final Random myRandom = new Random();

    private final NameGenerator nameGenerator = new NameGenerator();
    private final GradesGenerator gradesGenerator = new GradesGenerator();
    private final ClassroomNameGenerator classroomnameGenerator = new ClassroomNameGenerator();

    private Classroom[] classrooms;


    public School(int amountOfClassrooms, int minStudentsPerClassroom, int maxStudentsPerClassroom) {
        this.amountOfClassrooms = amountOfClassrooms;
        this.minStudentsPerClassroom = minStudentsPerClassroom;
        this.maxStudentsPerClassroom = maxStudentsPerClassroom;
    }

    private boolean initialCheck() {
        if (this.classrooms == null) {
            System.out.println("You need to initialize the school first. Please use 'initSchool'");
            return true;
        }
        return false;
    }

    public void initSchool() {
        // Creating classrooms
        this.classrooms = new Classroom[this.amountOfClassrooms];
        for (int i = 0; i < this.classrooms.length; i++) {

            // Creating lots of students out of thin air :)
            int amountOfStudents = this.myRandom.nextInt(this.minStudentsPerClassroom, this.maxStudentsPerClassroom + 1);
            Student[] studentsInClass = new Student[amountOfStudents];

            for (int j = 0; j < studentsInClass.length; j++) {
                String firstName = nameGenerator.getRandomName().firstName;
                String lastName = nameGenerator.getRandomName().lastName;
                float[] grades = new float[15];
                for (int k = 0; k < grades.length; k++) {
                    grades[k] = this.gradesGenerator.getRandomBiasedGrade();
                }
                studentsInClass[j] = new Student(firstName, lastName, grades);
            }

            // Creating a teacher
            String teacherFirstName = this.nameGenerator.getRandomName().firstName;
            String teacherLastName = this.nameGenerator.getRandomName().lastName;
            Teacher teacher = new Teacher(teacherFirstName, teacherLastName);

            // Creating classroomName
            String classroomName = this.classroomnameGenerator.getRandomClassroomName();
            this.classrooms[i] = new Classroom(teacher, studentsInClass, classroomName);
        }
    }

    public void printClassroomsOverview() {
        if (initialCheck()) return;

        for (Classroom classroom : this.classrooms) {

            String classRoomName = "[Classroom: " + classroom.getName() + "] ";
            String teacherName = "[Teacher: " + classroom.getTeacher().getFirstName() + " " + classroom.getTeacher().getLastName() + "] ";
            String amountOfStudents = "[Amount of Students: " + classroom.getStudents().length + "] ";

            System.out.println(classRoomName + teacherName + amountOfStudents);

            //  // Or:
            //  System.out.printf("[Classroom: %s] [Teacher: %s %s] [Amount of Students: %d]%n",
            //          classroom.getName(),
            //          classroom.getTeacher().getFirstName(),
            //          classroom.getTeacher().getLastName(),
            //          classroom.getStudents().length);
        }
    }


    // Individual solutions here
    public int getTotalStudents() {
        if (initialCheck()) return 0;

        int totalStudents = 0;
        for (Classroom classroom : this.classrooms) {
            totalStudents += classroom.getStudents().length;
        }
        return totalStudents;
    }

    public double getAverageClassSize() {
        if (initialCheck()) return 0;
        return (double) getTotalStudents() / this.classrooms.length;
    }
}
