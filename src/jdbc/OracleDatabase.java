package jdbc;

import java.sql.Connection;

import oracle.jdbc.pool.OracleDataSource;

public class OracleDatabase {
	private static OracleDataSource ods;

	// Static initializer 
	static {
		try {
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@localhost:1521:xe");
			ods.setUser("hr");
			ods.setPassword("hr");
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

	public static Connection getConnection() throws Exception {
		if (ods != null)
			return ods.getConnection();
		else
			return null;
	}

}
