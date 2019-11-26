package practice4.problem03;
//public static void main(String[] args) {
//Bird bird01 = new Duck();
//bird01.setName("꽥꽥이");
//bird01.fly();
//bird01.sing();
//bird01.showName();
//
//Bird bird02 = new Sparrow();
//bird02.setName("짹짹이");
//bird02.fly();
//bird02.sing();
//bird02.showName();
//}

public class Duck extends Bird {

    public void sing() {
    	System.out.printf("오리(%s)가 소리내어 웁니다.%n", getName());
    }

    public void fly() {
    	System.out.printf("오리(%s)가 날지 않습니다.%n", getName());
    }
    
    public void showName() {
    	System.out.printf("오리의 이름은 %s 입니다.%n", getName());
    }


}
