package com.ppzeff.aop.aspects;

import com.ppzeff.aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* com.ppzeff.aop.University.getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println(
                "beforeGetStudentsLoggingAdvice: логируем получение списка студентов перед методом getStudents ");
    }

    // @AfterReturning(pointcut = "execution(*
    // com.ppzeff.aop.University.getStudents())",
    // returning = "students")
    // public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
    // Student firstStudent = students.get(0);
    // String nameSurname = firstStudent.getNameSurname();
    // nameSurname = "Mr. " + nameSurname;
    // firstStudent.setNameSurname(nameSurname);
    // double avgGrade = firstStudent.getAvgGrade();
    // avgGrade = avgGrade + 1;
    // firstStudent.setAvgGrade(avgGrade);

    // System.out.println("beforeGetStudentsLoggingAdvice: логируем получение списка
    // студентов после работы " +
    // "метода getStudents ");
    // }

    @AfterThrowing(pointcut = "execution(* com.ppzeff.aop.University.getStudents())", throwing = "exception")
    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception) {
        System.out.println("afterThrowingGetStudentsLoggingAdvice : логируем исключение " + exception);
    }

    @After("execution(* com.ppzeff.aop.University.getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: логируем нормальное завершения"
                + " работы программы или выбрасывания исключения");
    }

    @AfterReturning(pointcut = "execution(* com.ppzeff.aop.University.getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firStudent = students.get(0);
        String nameSurname = firStudent.getNameSurname();
        nameSurname = "Mr. " + nameSurname;
        firStudent.setAvgGrade(firStudent.getAvgGrade() + 1);
        
    }
}
