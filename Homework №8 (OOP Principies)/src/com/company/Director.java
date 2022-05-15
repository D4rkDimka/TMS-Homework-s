package com.company;

public class Director extends Employee {
    private Employee[] employees;

    public Director(String name, String lastName, POSITION position, double workExperience) {
        super(name, lastName, position, workExperience);
    }

    @Override
    double countSalary(POSITION position, double workExperience) {
        double salary;

        if (employees == null) salary = position.getBaseRate() + (position.getCoefficient() * workExperience * 1);
        else salary = position.getBaseRate() + (position.getCoefficient() * workExperience * employees.length);

        return salary;
    }

    void putUnderControl(Employee employee) {
        if (this.employees == null) this.employees = new Employee[0];

        Employee[] tempEmployees = new Employee[this.employees.length + 1];

        for (int i = 0; i < employees.length; i++) {
            tempEmployees[i] = this.employees[i];
        }

        tempEmployees[tempEmployees.length - 1] = employee;

        employees = tempEmployees;
    }

    Employee[] getArrayOfWorkers() {
        return this.employees;
    }

    int getSizeOfArrayWorkers() {return this.employees.length;}

    void displayArrayOfWorker() {
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getName() + " " + employees[i].getLastName() + " (" + employees[i].getPosition() + ")");
            System.out.println();
        }
    }

    @Override
    void displayPersonalInfo() {
        System.out.printf("Full name: %s %s\nPosition: %s\nSalary: %.2f\n", super.getName(), super.getLastName(),
                super.getPosition(), countSalary(super.getPosition(), super.getWorkExperience()));
        System.out.print("\tEmployees\n");

        if (this.employees != null) {
            for (int i = 0; i < employees.length; i++) {
                if (employees[i] instanceof Worker) {
                    System.out.println(employees[i].getName() + " " + employees[i].getLastName() + " (" + employees[i].getPosition() + ")");
                    System.out.println();
                } else if (employees[i] instanceof Director) {
                    System.out.println(employees[i].getName() + " " + employees[i].getLastName() + " (" + employees[i].getPosition() + ")");
                    System.out.println("\tEmployees:\n");
                    ((Director) employees[i]).displayArrayOfWorker();
                }
            }
        } else
            System.out.println("There are no workers under control of " + super.getName() + " " + super.getLastName());
    }
}
