package com.github.manimovassagh.multipleSpringAPI.repository;

import com.github.manimovassagh.multipleSpringAPI.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
