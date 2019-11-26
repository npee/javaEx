package dao;

import java.util.List;

public interface AuthorDAO {
	//	Author 테이블로부터 전체 레코드를 불러오는 메서드
	//	구현체는 없음(Interface)
	public List<AuthorVO> getList();
	public AuthorVO get(Long id);				//	PK를 이용하여 레코드 불러오기
	public boolean insert(AuthorVO authorVO);
	public boolean delete(Long id);				//	PK를 이용하여 레코드 삭제하기
	public boolean update(AuthorVO authorVO);				
}
