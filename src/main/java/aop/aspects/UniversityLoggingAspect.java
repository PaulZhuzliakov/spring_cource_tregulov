package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLogicAdvice() {
//        System.out.println("beforeGetStudentsLogicAdvice");
//        System.out.println("--------------------------------------------------");
//    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLogicAdvice(List<Student> students) {
        Student student1 = students.get(0);

        String nameSurname = student1.getNameSurname();
        nameSurname = "mr. " + nameSurname;
        student1.setNameSurname(nameSurname);

        double avgGrade = student1.getAvgGrade();
        avgGrade += 1;
        student1.setAvgGrade(avgGrade);

        System.out.println("afterReturningGetStudentsLogicAdvice");
        System.out.println("--------------------------------------------------");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "ex")
    public void afterThrowingGetStudentsLogicAdvice(Throwable ex) {
        System.out.println("afterThrowingGetStudentsLogicAdvice");
        System.out.println(ex);
        System.out.println("--------------------------------------------------");
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLogicAdvice() {
        System.out.println("afterGetStudentsLogicAdvice");
        System.out.println("--------------------------------------------------");
    }
}
