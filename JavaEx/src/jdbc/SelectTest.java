package jdbc;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectTest {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		String dbuser = "hr";
		String dbpass = "hr";

		Connection conn = null;
		Statement stmt = null;	//	Statement
		ResultSet rs = null;	//	ResultSet
		
		try {
		//	1. 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//	2. Connection 객체 얻기
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);
		//	3. Statement 객체 얻어오기
			stmt = conn.createStatement();
		//	4. Statement 객체에 쿼리 담기
			String sql = "SELECT department_id, department_name " + 
						"FROM departments";
		//	5. SQL 수행 (-> ResultSet 받아오기)
			rs = stmt.executeQuery(sql);
		//	6. Data 처리
		//	System.out.println(rs);
			while(rs.next()) {
				//	정수, 문자열 컬럼
				int deptId = rs.getInt(1 /* = department_id */);
				String deptName = rs.getString("department_name" /* = 2 */);
				System.out.printf("%d : %s%n", deptId, deptName);
			}
			
		} catch (ClassNotFoundException e) {
			System.err.println("JDBC Driver를 찾지 못했습니다.");
		} catch (SQLException e) {
			System.err.println("SQLError");
		} finally {
			//	7. 자원 정리
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
