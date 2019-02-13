package lab8;

public class Employee extends Person {
    //properties
    //name, pid from Class Person

    private String position;
    private double salary;
    //constructor


    public Employee(String name, String pid, String position, double salary) {
        super(name, pid);
        this.position = position;
        this.salary = salary;
    }
    //toString

    @Override
    public String toString() {
        return "Employee{" +
                "position='" + position + '\'' +
                ", salary=" + salary +
                "} " + super.toString();
    }


    //getter and setter methods

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
