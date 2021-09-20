package com.github.manimovassagh.multipleSpringAPI.repository;

import com.github.manimovassagh.multipleSpringAPI.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent() {
        Student student = Student.builder().emailId("mani.mgh@gmail.com").
                firstName("Mani").
                lastname("Movassagh Ghazani").
                guardianName("Jorg").
                guardianEmail("jorg@cgi.com").
                guardianMobile("99999999")
                .build();
        studentRepository.save(student);

    }
    @Test
    public void printAllStudents(){
        List<Student> studentList = studentRepository.findAll();
        System.out.println("Student List" + studentList);

    }
}