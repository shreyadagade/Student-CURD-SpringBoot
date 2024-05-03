package com.student.studentcurdspringboot.model;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
@Entity
@Table(name = "student")

public class Student {





     @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;


    @Column(name = "name")
    private String studentName;


    @Column(name = "phone")
    private String phone;


    @Column(name = "email")
    private String email;

    @Column(name = "address")
    private String address;


    @Column(name = "gender")
    private String gender;


}
