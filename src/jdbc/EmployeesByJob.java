package jdbc;

import javax.sql.rowset.CachedRowSet;
import oracle.jdbc.rowset.OracleCachedRowSet;

public class EmployeesByJob {

	public static void main(String[] args) throws Exception {

		try (CachedRowSet crs = new OracleCachedRowSet()) {
			crs.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
			crs.setUsername("hr");
			crs.setPassword("hr");
			crs.setCommand("select * from employees where job_id = ?");
			crs.setString(1, "IT_PROG");

			crs.execute();

			while (crs.next()) {
				System.out.println(crs.getString("first_name") + " - " + crs.getInt("salary"));
			}
		}

	}

}
