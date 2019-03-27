package lab9_10;

import java.util.List;

public class EmployeeApp {
    public static void main(String[] args) {
        empDAOImpl dao = empDAOImpl.getInstant();

       //Get all data
        showData(dao);
       //Add new employee
//        dao.addEmp(new Employee(103,
//                "Piyapong Senanut",
//                "Programmer",
//                30000.00));
        //Find Employee
        System.out.println("Find Employee with ID: ");
        Employee emp = dao.findEmp(101);
        System.out.println(emp.toString());
        //Update Employee
        emp.setSalary(25000);
        dao.updateEmp(emp);  // update data in database
        showData(dao);
        //Delete Employee
        dao.deleteEmp(103);
        showData(dao);

    }

    private static void showData(empDAOImpl dao) {
        List<Employee> myEmp = dao.getAllEmp();
        System.out.println("Employee Data in Database: ");
        for (Employee emp:myEmp) {
            System.out.println(emp.toString());
        }
    }
}
