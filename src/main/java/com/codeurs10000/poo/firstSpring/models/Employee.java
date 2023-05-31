package com.codeurs10000.poo.firstSpring.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Employee {
    private String lastName, firstName;
    private int age, workExperience, employeeRank;
    private static int employeeTotal = 0;

    public abstract double getSalary();
}
