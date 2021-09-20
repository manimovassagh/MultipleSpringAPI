package com.github.manimovassagh.multipleSpringAPI.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Guardian {
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;
}
