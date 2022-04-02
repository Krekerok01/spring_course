package aop.studyPackages;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student student1 = new Student("Varvara Mamatsiuk", 4, 8.2);
        Student student2 = new Student("Nikita Mamatsiuk", 4, 1.5);
        Student student3 = new Student("Vlad Korold", 2, 5.6);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents()");
        //System.out.println(students.get(3));
        System.out.println("Information from method getStudents():");
        System.out.println(students);
        return students;
    }

}
