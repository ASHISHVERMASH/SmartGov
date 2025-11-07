package com.example.SmartGov.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(
        name = "BillPayments_detail"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class billPayments {
    private Long id;
    private String firstname;
    private String lastName;

}
