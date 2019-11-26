package dao;

//	DTO(VO) : 자바 클래스 간 혹은 레이어 간 데이터를 주고받기 위한 객체
//		- 일반적으로 로직 관련 메서드는 갖지 않는다
//		- 기본 생성자 1개가 있어야 한다.
//		- Getter/Setter를 이용해서 필드를 세팅한다.
//		- toString(), equals() 정도는 가질 수 있다.

public class AuthorVO {
	//	fields
	private Long authorId;
	private String authorName;
	private String authorDesc;
	
	//	constructors 
	public AuthorVO() {}	//	기본 생성자 1개 있어야함
	public AuthorVO(Long id, String name, String desc) {
		authorId = id;
		authorName = name;
		authorDesc = desc;
	}
	//	methods
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorDesc() {
		return authorDesc;
	}
	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}
	@Override
	public String toString() {
		return "AuthorVO [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}
	@Override
	public boolean equals(Object arg0) {
		//	authorId를 PK로 쓰고 있으므로 이를 이용하여 같은 레코드인지 구별 가능
		if (arg0 instanceof AuthorVO) {// 같으면 다운캐스팅
			AuthorVO other = (AuthorVO)arg0;
			return this.authorId == other.authorId;
		}		
		return super.equals(arg0);
	}
	
	
	
}
