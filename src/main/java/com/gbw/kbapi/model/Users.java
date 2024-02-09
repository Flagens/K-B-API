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
public class Users {
    private int id;
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String address;
    private String password;
}
