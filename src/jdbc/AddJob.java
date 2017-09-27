package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class AddJob {

	public static void main(String[] args) throws Exception {

		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")) {
			
			PreparedStatement ps = con.prepareStatement("insert into jobs values(?,?,null,null)");
			ps.setString(1,"JEP");
			ps.setString(2,"Java EE Programmer");
			
			int count = ps.executeUpdate(); 
			
            if (count == 1)
            	System.out.println("Added Job Successfully!");
          
		}

	}

}
