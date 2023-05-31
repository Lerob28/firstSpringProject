package com.codeurs10000.poo.firstSpring.models;

import static com.codeurs10000.poo.firstSpring.utils.Utility.BASE_SALARY;
import lombok.experimental.SuperBuilder;


@SuperBuilder
public class Worker extends  Employee{

    @Override
    public double getSalary() {
        return (double) (this.getWorkExperience()*BASE_SALARY);
    }
}