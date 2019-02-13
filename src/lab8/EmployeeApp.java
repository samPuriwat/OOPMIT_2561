package lab8;

public class EmployeeApp {
    public static void main(String[] args) {


        Employee emp = new Employee("Puriwat",
                "PID001",
                "Lecturer",
                15000);

        System.out.println(emp.toString());
        System.out.println(emp.getPid());




    }
}
