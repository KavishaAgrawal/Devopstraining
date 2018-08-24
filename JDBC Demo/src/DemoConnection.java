import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoConnection {
    public static void main(String[] args) {
		Connection con = null;
    	try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CITI","sa","sa123");
			con.setAutoCommit(false);
			System.out.println("connection successful");
			
			Statement st = con.createStatement();
			st.executeUpdate("insert into employee values(910,'City',10000)");
			st.executeUpdate("insert into employee values(920,'City',10000)");
			st.executeUpdate("insert into employee values(1,'City',10000)");
			st.executeUpdate("insert into employee values(940,'City',10000)");
			
			con.commit();
			
//			String INSERT_EMPLOYEE = "insert into employee values(1,'City', 10000)";
//			Statement st = con.createStatement();
//			int rows = st.executeUpdate(INSERT_EMPLOYEE);
//			System.out.println("rows inserted:"+rows);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		
	}
}
