package com.github.manimovassagh.multipleSpringAPI.repository;

import com.github.manimovassagh.multipleSpringAPI.entity.Guardian;
import com.github.manimovassagh.multipleSpringAPI.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder().emailId("mani.mgh@gmail.com").
                firstName("Mani").
                lastname("Movassagh Ghazani")
                //guardianName("Jorg").
                //guardianEmail("jorg@cgi.com").
                //guardianMobile("99999999")
                .build();
        studentRepository.save(student);

    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .email("Guardian@gmail.com")
                .name("Mojde")
                .mobile("7777777")
                .build();
        Student student = Student.builder()
                .firstName("Sahar")
                .lastname("Morattab")
                .emailId("Sahar@Gmail.com")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    public void printAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("Student List" + studentList);

    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students = studentRepository.findByFirstName("Sahar");
        System.out.println("students = " + students);

    }

    @Test
    public void printStudentByNameContaining(){
        List<Student> students = studentRepository.findByFirstNameContaining("Sah");
        System.out.println("students = " + students);

    }

    }

}
}