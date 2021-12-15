package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        Student s1 = new Student("Oleg Viktorovich", 5, 9.9);
        Student s2 = new Student("Zaur Tregulov", 1, 0.9);
        Student s3 = new Student("Nasty Ilenko", 5, 9.8);

        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    public List<Student> getStudents() {
        System.out.println("Information from method getStudents: ");
        System.out.println(students);
        return students;
    }
}
