package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ListJobs {

	public static void main(String[] args) throws Exception {

		try (Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr")) {
			
			PreparedStatement ps = con.prepareStatement("select * from jobs");
			
			ResultSet rs = ps.executeQuery();
			
			while( rs.next()) {
				System.out.println(  rs.getString(2) );
			}
			
			ps.close();
			rs.close();
		}

	}

}
