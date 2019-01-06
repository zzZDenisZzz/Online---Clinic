package com.corey.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Patient {

    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private int age;
    private String dateOfVisit;
    private String illness;

}
