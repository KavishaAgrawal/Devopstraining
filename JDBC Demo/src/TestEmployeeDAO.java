import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.List;

import com.pojos.Employee;

public class TestEmployeeDAO {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       System.out.println("enter employee details:");
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
     System.out.println("enter employee id");
     //int empID = br.readLine();
     int empID = Integer.parseInt(br.readLine());
     System.out.println("enter name");
      String name = br.readLine();
      System.out.println("enter salary");
      int salary = Integer.parseInt(br.readLine());
		Employee myEmployee=new Employee(empID,salary,name);
       EmployeeDAO dao = new EmployeeDAO();
       int rows = dao.addEmployee(myEmployee);
       if(rows>0) {
    	   System.out.println("record inserted successfully");
       }else
    	   System.out.println("Sorry");
	}
	
		
	}


