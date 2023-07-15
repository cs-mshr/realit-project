package com.realit.realits.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    @Id
    private Integer id;

    private String companyName;
    private int yearOfEstablishment;

    @OneToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
