package com.example.onetoone.Dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentDto {

    private String name;
    private String email;
    private int age;
    private String city;
}
