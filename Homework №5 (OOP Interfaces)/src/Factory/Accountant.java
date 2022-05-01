package Factory;

public class Accountant extends Director{
    private String position;
    private double salary;

    Accountant(){}

    Accountant(String position, double salary)
    {
        super(position,salary);
    }

    @Override
    public void displayPersonInformation() {
        super.displayPersonInformation();
    }

    @Override
    public String getPosition() {
        return position;
    }

    @Override
    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
