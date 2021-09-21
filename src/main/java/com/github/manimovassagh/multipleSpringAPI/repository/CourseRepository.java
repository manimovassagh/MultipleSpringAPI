package com.github.manimovassagh.multipleSpringAPI.repository;

import com.github.manimovassagh.multipleSpringAPI.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course,Long> {


}
