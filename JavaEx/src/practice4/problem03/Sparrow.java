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
public class Sparrow extends Bird {

	@Override
	public void fly() {
		System.out.printf("참새(%s)가 날아 다닙니다.%n", getName());
		
	}

	@Override
	public void sing() {
		System.out.printf("참새(%s)가 소리내어 웁니다.%n", getName());
		
	}

	@Override
	public void showName() {
		System.out.printf("참새의 이름은 %s 입니다.%n", getName());
		
	}



}
