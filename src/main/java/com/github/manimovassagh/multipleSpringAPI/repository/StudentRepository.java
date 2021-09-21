package com.github.manimovassagh.multipleSpringAPI.repository;

import com.github.manimovassagh.multipleSpringAPI.entity.Student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findByFirstName(String firstName);
    List<Student> findByFirstNameContaining(String name);
    List<Student> findByLastNameNotNull();
    List<Student> findByGuardianName(String guardianName);

    @Modifying
    @Transactional
    @Query(
            value = "update tbl_student set first_name= ?1 where email_address = ?2 ",
            nativeQuery = true
    )
    int updateStudentByEmailID(String firstName, String emailId);
    }
