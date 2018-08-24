import java.util.List;

import com.pojos.Employee;

public class TestFindEmployee {
   public static void main(String[] args) {
	EmployeeDAO dao = new EmployeeDAO();
	List<Employee> emps=dao.findAllEmployees();
	for(Employee employee:emps) {
		System.out.println(employee.getName());
	}
}
}
