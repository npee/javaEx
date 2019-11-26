package jdbc;

import java.sql.*;
import java.util.Scanner;
public class HRSalary {

	public static void main(String[] args) {
	
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner s = new Scanner(System.in);
		
		System.out.print("최소, 최대 급여 입력 : ");
		int minSalary = s.nextInt();
		int maxSalary = s.nextInt();
		System.out.println("=============================================");
		try {		
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			
			String sql = "SELECT first_name || ' ' || last_name, salary FROM employees "
						+ "WHERE salary > ? AND salary < ? ORDER BY salary ASC";
				
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, minSalary);
			pstmt.setInt(2, maxSalary);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.printf("%s\t\t%s%n", rs.getString(1), rs.getString(2));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 클래스를 찾을 수 없습니다.");
		} catch (SQLException e) {
			System.err.println("SQLError");
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		s.close();

	}

}
