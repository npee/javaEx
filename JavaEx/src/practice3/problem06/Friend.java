package practice3.problem06;

public class Friend {

    private String name;
    private String hp;
    private String school;   
    
    //필요한 메소드 작성
    
    public Friend setFriend(String str) {
    	this.name = str.split(" ")[0];
    	this.hp = str.split(" ")[1];
    	this.school = str.split(" ")[2];
    	return this;
    }
    
    public void showInfo(){
        System.out.println("이름:"+name+"  핸드폰:"+hp+"  학교:"+school);
    }

}
