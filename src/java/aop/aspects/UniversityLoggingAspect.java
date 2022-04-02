package aop.aspects;

import aop.studyPackages.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice(): логгируем получение " +
//                "списка студентов ПЕРЕД методом getStudents()");
//    }




//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//
//        firstStudent.setNameSurname(nameSurname);
//
//        double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade + 1;
//        firstStudent.setAvgGrade(avgGrade);
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice(): логгируем получение " +
//                "списка студентов ПОСЛЕ работы метода getStudents()");
//    }





//    @AfterThrowing("execution(* getStudents())")
//    public void afterThrowingGetStudentsLoggingAdvice(){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice(): логгируем выброс исключения");
//    }


//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice(): логгируем выброс исключения " + exception);
//    }





    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice(): логгируем нормальное" +
                " окончание работы метода или выброс исключения");
    }
}
