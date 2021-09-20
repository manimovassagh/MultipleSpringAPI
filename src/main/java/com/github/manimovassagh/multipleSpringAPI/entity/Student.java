package com.github.manimovassagh.multipleSpringAPI.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
//@Table(name = "tbl_student") If you want to change the table name or column this is a way
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentId;
    private String firstName;
    private String lastname;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
