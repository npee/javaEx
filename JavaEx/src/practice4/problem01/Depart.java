package practice4.problem01;

public class Depart extends Employee {

    //코드작성
	/* main()	 
	 	Employee pt = new Depart( "홍길동", 5000, "개발부" );
     	pt.getInformation();
	 */
	//	field
	private String department;	//	부서 필드
	
	//	constructor
	public Depart(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}
	
	//	method
	public void getInformation() {
		//	Employee의 field가 private이므로 getter 메서드를 이용
		System.out.printf("이름 : %s 연봉 : %d 부서 : %s%n", getName() ,getSalary(), department);
	}
}
