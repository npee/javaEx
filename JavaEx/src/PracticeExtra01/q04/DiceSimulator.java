package PracticeExtra01.q04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiceSimulator {
	//	Begin:	본 필드의 형식이나 선언부는 수정하지 않습니다.
	List<Integer> diceList;
	//	End:	본 필드의 형식이나 선언부는 수정하지 않습니다.
	
	public DiceSimulator() {
		this.diceList = new ArrayList<>();
	}
	
	public void simulate(int count) {
		//	TODO: 여기에 코드를 작성합니다.
		//	참고: 1 ~ 6 사이의 정수 난수를 발생하는 식은 다음과 같습니다
		//		(int)(Math.random() * 6) + 1;
		diceList.clear();
		//Iterator<Integer> it = diceList.iterator();
		for (int i = 0; i < count; i++) {
			diceList.add(i, (int)(Math.random() * 6 + 1));
		}

	}
	
	public double getPossibility(int num) {
		//	TODO: 여기에 코드를 작성합니다.
		double count = 0;
		
//		for (int dice : diceList) {
//			if (dice == num) {
//				count++;
//			}
//		}
		Iterator<Integer> it = diceList.iterator();
		while (it.hasNext()) {
			if (it.next() == num)
				count++;
		}
		
		return count / diceList.size();
	}
	
	//	Begin: 이곳은 테스트를 위한 코드이므로 변경하지 마십시오
	public void showDices() {
		System.out.println(diceList);	
	}
	//	End: 이곳은 테스트를 위한 코드이므로 변경하지 마십시오
	
}
