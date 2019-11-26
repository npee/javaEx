package practice2;

public class Problem01 {
	public static void main(String args[]) {
		int[] data = {1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31};
		
		// 3의 배수의 개수
		int numOfMultifleOfThree = 0;
		int sumOfMultifleOfThree = 0;
		for (int temp: data) {
			if (temp % 3 == 0) {
				numOfMultifleOfThree++;
				sumOfMultifleOfThree += temp;
			}
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + numOfMultifleOfThree);
		
		// 3의 배수의 합
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sumOfMultifleOfThree);
		
	}
}
