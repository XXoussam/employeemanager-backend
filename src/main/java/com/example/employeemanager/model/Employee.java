package com.example.employeemanager.model;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Data
@ToString
public class Employee implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false,updatable = false)
    private Long id;
    private String name;
    private String email;
    private String phone;
    private String imageURL;
    private String jobTitle;
    @Column(nullable = false,updatable = false)
    private String employeeCode;

    public Employee() {
    }

    public Employee(Long id, String name, String email, String phone, String imageURL, String jobTitle, String employeeCode) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.imageURL = imageURL;
        this.jobTitle = jobTitle;
        this.employeeCode = employeeCode;
    }
}
