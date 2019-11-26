package practice2;

public class Problem04 {
	public static void main(String[] args) {
		int[] arr;
		arr = new int[6];
		int temp, i = 0;

		//	중복체크
		while (i < arr.length) {
			// Loop 탈출용 논리값
			boolean b = false;
			
			temp = (int)(Math.random() * 45 + 1);
			//	temp와 같은 값이 배열에 하나라도 나오면
			for (int j = 0; j < 6; j++) {
				if (arr[j] == temp) {
					b = true;	//	논리값을 true로 바꾸고
					break;		//	같은값 탐색 루프 종료(없어도됨)
				}	
			}
			
			if (b) {		//	위에서 같은값이 발견되었으면
				continue;	//	아래 코드는 무시하고 다음 루프 시작
			}

			arr[i] = temp;
			i++;
		}

		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

