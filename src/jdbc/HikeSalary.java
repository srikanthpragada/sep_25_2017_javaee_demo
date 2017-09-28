package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HikeSalary {

	public static void main(String[] args) throws Exception {

		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")) {
			
			Statement st = con.createStatement();
			int count = st.executeUpdate("update employees set salary = 7500 where employee_id = 150");
			// one more statement 
			// one more statement
            if ( count == 1)
            	System.out.println("Updated Successfully!");
            else
            	System.out.println("Employee id not found!");
		}

	}

}
