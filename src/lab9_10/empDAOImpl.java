package lab9_10;

import java.sql.Connection;
import java.util.List;

public class empDAOImpl implements employeeDAO {
    public static String driverName = "org.sqlite.JDBC";
    public static String url = "jdbc:sqlite:D:/company.sqlite";
    public static Connection conn = null;

    //Constant operators
    private static empDAOImpl instant = new empDAOImpl();
    public static empDAOImpl getInstant(){
        return instant;
    }
    //constructor


    private empDAOImpl() {
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Load Driver Successfully.");
    }

    @Override
    public List<Employee> getAllEmp() {
        return null;
    }

    @Override
    public void addEmp(Employee newEmp) {

    }

    @Override
    public void updateEmp(Employee emp) {

    }

    @Override
    public void deleteEmp(int id) {

    }

    @Override
    public Employee findEmp(int id) {
        return null;
    }
}//class
