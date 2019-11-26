package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AuthorDAOImpl implements AuthorDAO {
	private static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String dbuser = "bituser";
	private static String dbpass = "bituser";
	
	private Connection getConnection() throws SQLException {	//	외부에서 사용할일이 없다.(private)
		Connection conn = null;
		try {	
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, dbuser, dbpass);	//	SQL 예외는 메인으로 던져주자 -> throw
																		//	메서드 내의 단일책임...
																		//	트랜잭션의 입장에서 보자
																		//	다른 메서드에서 예외가 영향을 끼칠 경우 상위 메서드에서 한방에 처리하도록.

		} catch (ClassNotFoundException e) {
			System.err.println("JDBC 드라이버 로드 실패");
		}
		return conn;
	}
	
	@Override
	public List<AuthorVO> getList() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List<AuthorVO> list = new ArrayList<>();
		
		/* SQL Database Logic */
		try {
			conn = getConnection();
			stmt = conn.createStatement();
			
			String sql = "SELECT author_id, author_name, author_desc FROM author";
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Long authorId = rs.getLong(1);
				String authorName = rs.getString("author_name");
				String authorDesc = rs.getString(3);
				
				AuthorVO author = new AuthorVO(authorId, authorName, authorDesc);

				list.add(author);
			}						
		} catch (SQLException e) {
			System.err.println("SQL ERROR");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return list;
	}


	@Override
	public AuthorVO get(Long id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		AuthorVO author = null;
		try {
			conn = getConnection();
			String sql = "SELECT author_id, author_name, author_desc FROM author WHERE author_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
			
			rs = pstmt.executeQuery();
			
			if (rs.next()) {	//	레코드가 있으면
				author = new AuthorVO(rs.getLong(1), rs.getString(2), rs.getString(3));
			}
			
		} catch (SQLException e)  {
			System.err.println("SQL ERROR");
		} finally {
			try {
				//rs.close();
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}		
		return author;
	}

	@Override
	public boolean insert(AuthorVO authorVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int insertedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "INSERT INTO author VALUES(seq_author_pk.NEXTVAL, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorVO.getAuthorName());
			pstmt.setString(2, authorVO.getAuthorDesc());
			
			//	INSERT, UPDATE, DELETE는 executeUpdate
			//		-> 영향을 받은 레코드의 갯수를 반환
			insertedCount = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (Exception e) {}
		}
		return 1 == insertedCount;
	}

	@Override
	public boolean delete(Long id) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		int deletedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "DELETE FROM author WHERE author_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, id);
		
			deletedCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("SQL ERROR");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		return 0 != deletedCount;
	}

	@Override
	public boolean update(AuthorVO authorVO) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		int updatedCount = 0;
		
		try {
			conn = getConnection();
			String sql = "UPDATE author SET author_name = ?, author_desc = ? WHERE author_id = ?";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, authorVO.getAuthorName());
			pstmt.setString(2, authorVO.getAuthorDesc());
			pstmt.setLong(3, authorVO.getAuthorId());
			
			updatedCount = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.err.println("SQL ERROR");
		} finally {
			try {
				pstmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}	
		}

		return 1 == updatedCount;
	}

}
