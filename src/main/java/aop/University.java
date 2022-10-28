package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent() {
        Student student1 = new Student("PavelZhuzliakov", 1, 5);
        Student student2 = new Student("MihailLaptev", 2, 7.5);
        Student student3 = new Student("SvetlanaKriuchkova", 2, 8.6);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents() {
        System.out.println("begining of method getStudents");
        System.out.println(students.get(3)); //exception
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        System.out.println("--------------------------------------------------");
        return students;
    }
}
