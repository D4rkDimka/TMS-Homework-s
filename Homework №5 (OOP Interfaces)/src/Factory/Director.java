package Factory;

public class Director implements Employee{
    private String position;
    private double salary;

    Director (){}
    Director(String position,double salary)
    {
        this.position = position;
        this.salary = salary;
    }
    @Override
    public void displayPersonInformation() {
        System.out.printf("Position: %s\n",this.position);
        System.out.printf("Salary: %f\n",this.salary);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
