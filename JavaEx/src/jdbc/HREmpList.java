package jdbc;

import java.sql.*;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.println("검색결과");
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			stmt = conn.createStatement();
			
			String sql = "SELECT emp.first_name, NVL(mgr.first_name, ' ') FROM employees emp " +
						"LEFT JOIN employees mgr ON emp.manager_id = mgr.employee_id " +
						"ORDER BY emp.first_name DESC";
			
			rs = stmt.executeQuery(sql);
			int i = 1;
			while (rs.next()) {
				System.out.printf("%d: %s\t%s%n", i, rs.getString(1), rs.getString(2));
				i++;
			}

		} catch(ClassNotFoundException e) {
			System.err.println("JDBC 클래스를 찾을 수 없습니다.");
		} catch(SQLException e) {
			System.err.println("SQLError");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	}
}
