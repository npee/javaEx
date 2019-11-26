package practice3.problem07;

public class Account {

    private String accountNo;
    private int balance;
    
    //생성자 작성
    public Account() {
    	
    }
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    	this.balance = 0;
    	
    }
    
    //필요한 메소드 작성
    public void join() {
    	System.out.println(accountNo + " 계좌가 개설되었습니다.");
    }
    
    public void deposit(int money) {
    	balance += money;
    }
    
    public void withdraw(int money) {
    	balance -= money;
    }
    
    public void showBalance() {
    	System.out.println(balance);
    }

}
