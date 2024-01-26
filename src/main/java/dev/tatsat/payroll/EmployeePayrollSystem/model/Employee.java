package dev.tatsat.payroll.EmployeePayrollSystem.model;

import jakarta.persistence.*;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "employee")
@Getter
@Setter
@EqualsAndHashCode
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "salary", nullable = false)
    @Min(value = 1, message = "Invalid salary: Equals to zero")
    @Max(value = 100, message = "Invalid salary: Exceeds salary range")
    private double salary;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employee")
    private List<Payroll> payrollList;
}