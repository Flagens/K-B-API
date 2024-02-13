package com.gbw.kbapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

import java.util.Date;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeID;
    private String name;
    private String surname;
    private String bankAccount;
    private String address;
    private String phone;
    private Date birth;
    private String password;
    private int roleID;
}
