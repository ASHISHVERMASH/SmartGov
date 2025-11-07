package com.example.SmartGov.entity;

import com.example.SmartGov.enums.Gender;
import com.example.SmartGov.enums.ROLES;
import com.example.SmartGov.enums.State;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(
        name = "Citizens", uniqueConstraints = {
                @UniqueConstraint(columnNames = "email"),
                @UniqueConstraint(columnNames = "aadharNumber")
}
)

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private LocalDate dateOfBirth;

    private Gender gender;

    @Column(nullable = false , length = 12,unique = true)
    private String aadharNumber;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false , length = 10, unique = true)
    private String mobileNumber;

    private State States;

    private String district;

    private ROLES role;

    @Column(nullable = false)
    private LocalDate createdAt;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalDate.now();
        if (this.role == null) {
            this.role = ROLES.CITIZENS;
        }
    }
    
}
