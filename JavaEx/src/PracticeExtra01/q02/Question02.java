package PracticeExtra01.q02;

public class Question02 {
	public int getAnswer(int toNum) {
		int lcm = toNum;
		int temp = lcm;
		
		for (int i = toNum; i >= 2; i--) {
			while(true) {
				if ((lcm % temp == 0) && (lcm % (i - 1) == 0)) {
					temp = lcm;
					break;
				}
				lcm++;

				//System.out.printf("lcm : %d, i : %d, i-1 : %d%n", lcm, i, i-1);
			}
			//break;
		}
		
		return lcm;
	}
}