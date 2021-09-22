package com.github.manimovassagh.multipleSpringAPI.repository;


import com.github.manimovassagh.multipleSpringAPI.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial,Long> {
}
