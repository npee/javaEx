package jdbc;

import java.sql.*;
import java.util.Scanner;

public class HRSearchEmployeesPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
			System.out.print("검색어를 입력하세요 : ");
			String keyword = scanner.next();
			//	정적 SQL이 아니라 파라미터를 외부에서 입력하는 경우
			//	PreparedStatement를 사용하자!
			//	효율성, [보안적 측면]에서 유리
			
			
			String sql = "SELECT first_name, last_name, email, phone_number, hire_date FROM employees " +
						"WHERE LOWER(first_name) LIKE ? OR LOWER(last_name) LIKE ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%");
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
			
			rs = pstmt.executeQuery();
			
			System.out.println("[검색결과]");
			while (rs.next()) {
				System.out.printf("%s %s: %s\t %s\t %s%n", rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));	
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

		scanner.close();
	}

}
