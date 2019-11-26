package jdbc;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployees {

	public static void main(String[] args) {
		//	str
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		//	obj
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
	
			System.out.print("이름을 입력하세요 :");
			String keyword = scanner.next();
			
			//	쿼리 만들기
			String sql = "SELECT first_name, last_name, email, phone_number, hire_date " + 
						"FROM employees WHERE LOWER(first_name) LIKE '%" + keyword +
						"%' " + "OR LOWER(last_name) LIKE '%" + keyword +
						"%'";
			
			System.out.println("Query : " + sql);
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			System.out.println("[검색결과]");
			
			while(rs.next()) {
				System.out.printf("%s %s : %s, %s, %s%n",
						rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver를 찾지 못했습니다.");
		} catch (SQLException e) {
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
		scanner.close();


	}

}
