import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.connection.MyConnection;
import com.pojos.Employee;

public class EmployeeDAO {
	public int addEmployee(Employee emp) {
		String INSERT_EMPLOYEE = "insert into employee values(?,?,?)";
		int r = 0;
		try {
			PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(INSERT_EMPLOYEE);
			ps.setInt(1, emp.getEmpID());
			ps.setString(2, emp.getName());
			ps.setInt(3, emp.getSalary());

			r = ps.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return r;

	}

public List<Employee>findAllEmployees()
{
 List<Employee> employees = new ArrayList<Employee>();
 String FIND_ALL_EMPLOYEES="select *from employee";
	try {
		Statement st = MyConnection.getMyConnection().createStatement();
		ResultSet set = st.executeQuery(FIND_ALL_EMPLOYEES);
		while(set.next()) {
			int empID = set.getInt(1);
			String name = set.getString(2);
			int salary = set.getInt(3);
			Employee emp = new Employee(empID, salary, name);
			employees.add(emp);
			//System.out.println(empID+" "+salary);
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return employees;
}
public Employee updateEmployee(int empID, Employee employee) {
	Employee emp = new Employee();
	String UPDATE_EMPLOYEE = "update employee set salary =? where empID=?";
	try {
		PreparedStatement ps = MyConnection.getMyConnection().prepareStatement(UPDATE_EMPLOYEE);
		ps.setInt(1, employee.getSalary());
		ps.setInt(2, empID);
		int row = ps.executeUpdate();
		if(row>0) {
			emp = employee;
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return emp;
}
public Employee findEmployeeByID(int empID) { 
	Employee emp = new Employee();
	String Find_By_Id = "select*from employee where empID =?";
	PreparedStatement ps;
	try {
		ps = MyConnection.getMyConnection().prepareStatement(Find_By_Id);
		ps.setInt(1,empID);
		ResultSet set = ps.executeQuery();
		while(set.next()) {
			emp = new Employee(set.getInt("empID"),set.getInt("salary"),set.getString("name"));
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return emp;
}
}
