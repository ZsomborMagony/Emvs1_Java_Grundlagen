package ch.berufsbildung.vs.campus;

import ch.berufsbildung.vs.human.Student;
import ch.berufsbildung.vs.human.Teacher;

public class Classroom {
    private final Student[] students;
    private final Teacher teacher;

    private final String name;

    public Classroom(Teacher teacher, Student[] students, String name) {
        this.teacher = teacher;
        this.students = students;
        this.name = name;
    }


    public Student[] getStudents() {
        return students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public String getName() {
        return name;
    }
}
