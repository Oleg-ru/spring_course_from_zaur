package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsAdvice() {
        System.out.println("beforeGetStudentsAdvice: логируем получение списка студентов" +
                " перед методом getStudents");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsAdvice(List<Student> students) {

        Student student1 = students.get(0);
        student1.setNameSurname("Mr. " + student1.getNameSurname());
        student1.setAvgGrade(student1.getAvgGrade() + 1);


        System.out.println("afterReturningGetStudentsAdvice: логируем получение списка студентов" +
                " после работы метода getStudents");
    }
}
