package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TransDemo {

	public static void main(String[] args) throws Exception {

		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")) {
			con.setAutoCommit(false);
			try {
				Statement st = con.createStatement();
				st.executeUpdate("update employees set salary = 7500 where employee_id = 150");
				st.executeUpdate("update employees set salary = 5500 where employee_id = 151");

				con.commit();
			} catch (Exception ex) {
				con.rollback();
			}
		}

	}

}
