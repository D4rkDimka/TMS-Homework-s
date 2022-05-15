package com.company;

abstract public class Employee {
    private String name;
    private String lastName;
    private POSITION position;
    private double workExperience;

    public Employee() {
    }

    public Employee(String name, String lastName, POSITION position, double workExperience) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.workExperience = workExperience;
    }

    abstract double countSalary(POSITION position, double workExperience);

    abstract void displayPersonalInfo();

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public POSITION getPosition() {
        return position;
    }

    public double getWorkExperience() {
        return workExperience;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPosition(POSITION position) {
        this.position = position;
    }

    public void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }
}
