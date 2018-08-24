import com.pojo.Employee;

public interface EmployeeIO {
   public static double PI = 3.14;
   public static final String  NAME = "CITY";
   
   abstract public Employee readEmployee();
   abstract public void writeEmployee(Employee employee);
   
}
