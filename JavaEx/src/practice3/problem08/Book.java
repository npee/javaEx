package practice3.problem08;

public class Book {
    
    private int bookNo;
    private String title;
    private String author;
    private int stateCode;  
    
    public Book(int bookNo, String title, String author) {
    	this.bookNo = bookNo;
    	this.title = title;
    	this.author = author;
    	this.stateCode = 1;
    }
    
    public int getStateCode() {
    	return stateCode;
    }
    
    public void setStateToggle() {
    	if (this.stateCode == 0)
    		this.stateCode = 1;
    	else
    		this.stateCode = 0;
    }

    public void rent() {
    	
    	if (stateCode == 1) {
    		System.out.println(this.title + " 이(가) 대여 됐습니다.");
    		this.stateCode = 0;
    	} else {
    		System.out.println("이미 대여중인 책입니다.");
    	}
    }

    public void print() {
    	String message;
    	if (this.stateCode == 1)
    		message = "재고있음";
    	else
    		message = "대여중";
    	System.out.printf("%d 책 제목 : %s, 작가 : %s, 대여 유무 : %s%n", this.bookNo, this.title, this.author, message);
    	
    }
    
}


