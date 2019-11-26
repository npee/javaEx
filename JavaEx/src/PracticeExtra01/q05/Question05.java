package PracticeExtra01.q05;

public class Question05 {
	private int scores[];
	
	public Question05(int scores[]) {
		this.scores = scores;
	}
	
	public int getTotal() {
		int total = 0;
		//	TODO: 여기에 로직 코드를 작성합니다
		int i = 0;
		while (i < scores.length) {
			if (!(scores[i] < 0 || scores[i] > 100))
				total += scores[i];
			i++;
		}
		return total;
	}
	
	public double getAverage() {
		int total = 0, count = 0;
		//	TODO: 여기에 로직 코드를 작성합니다
		for(int score : scores) {
			if (!(score < 0 || score > 100)) {
				total += score;
				count++;	
			}
		}	
		return total / count;
	}
}
