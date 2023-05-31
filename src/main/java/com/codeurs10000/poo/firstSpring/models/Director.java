package com.codeurs10000.poo.firstSpring.models;

import static com.codeurs10000.poo.firstSpring.utils.Utility.BASE_SALARY;
import lombok.Builder;
import lombok.experimental.SuperBuilder;


@SuperBuilder
public class Director extends Employee{
    @Override
    public double getSalary() {
        return (double) ((this.getWorkExperience()*2)*BASE_SALARY);
    }
}