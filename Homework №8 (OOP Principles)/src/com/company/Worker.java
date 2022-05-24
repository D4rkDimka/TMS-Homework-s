
package com.company;

public class Worker extends Employee {
    Worker() {
    }

    Worker(String name, String lastName, POSITION position, double workExperience) {
        super(name, lastName, position, workExperience);
    }


    @Override
    double countSalary(POSITION position, double workExperience) {
        double salary = position.getBaseRate() + (position.getCoefficient() * workExperience);
        return salary;
    }
/*

    @Override
    void displayPersonalInfo() {
        System.out.printf("Full name %s %s\nPosition: %s\nSalary: %.2f", super.getName(), super.getLastName(),
                super.getPosition(),countSalary(super.getPosition(), super.getWorkExperience()));
    }
*/

}