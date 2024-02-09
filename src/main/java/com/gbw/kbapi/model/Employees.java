package com.gbw.kbapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class Employees {
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
