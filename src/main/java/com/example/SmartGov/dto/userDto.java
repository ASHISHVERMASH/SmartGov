package com.example.SmartGov.dto;

import com.example.SmartGov.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

public class userDto {

    private Long userId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String aadharNumber;
    private String email;
    private String mobileNumber;
    private String address;
    private Role role;
    private LocalDate createdAt;



}
