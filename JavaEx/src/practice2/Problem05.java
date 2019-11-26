package practice2;

public class Problem05 {
	//	배열 내에서 85점 이상인 점수만 뽑아, 총 합과 평균값 산출
	static int scoreboard[][] = {
			{ 80, 75, 90, 95, 78 },
			{ 92, 88, 89, 92, 70 },
			{ 78, 80, 85, 86, 63 },
			{ 83, 84, 89, 87, 75 },
			{ 89, 83, 93, 94, 78 }
	};
	public static void main(String[] args) {
		int total = 0;
		int count = 0;

		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (scoreboard[i][j] >= 85) {
					total += scoreboard[i][j];
					count++;
				}
			}
		}
		System.out.println("총  합 : " + total);
		System.out.printf("평균값 : %.2f%n", (float)total / count);
		
	}
}
