package com.bit.javaex.basic.reftype;

public class ArrayEx {

	public static void defineArray() {
		// 배열의 선언
		String[] names;
		int scores[];
		
		//System.out.println(names);
		
		names = new String[] {
				"홍길동", "전우치", "장길산"
		}; // 데이터가 이미 있는 경우 개수는 표기하지않아도 됨 
		
		// 선언시 이미 데이터를 알고 있을 때
		int height[] = {
				175, 180, 176
		}; // 선언과 동시에 할 경우
		
		scores = new int[4]; //4개의 공간을 가진 빈 배열
		// 내부 공간에 접근 -> 인덱스
		// 인덱스는 0부터 시작 ~ 배열의 길이 - 1까지
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 80;
		//scores[4] = 100; 배열 범위를 벗어남 -> 에러
		
		// scores 배열의 점수를 합산해서 총점과 평균을 출력합시다
		int total = 0;
		for (int i = 0; i < 4; i++) {
			total += scores[i];
		}
		System.out.printf("총점 : %d, 평균 : %.2f%n", total, (float)total / scores.length);
	}
	
	public static void arrayCopy() {
		
		// 배열은 생성되면 크기를 변경할 수 없다
		// Solution: 더 큰 크기의 새 배열을 만들고 항목값을 복사
		int source[] = {1, 2, 3};
		int target[] = new int[10];
		
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
		
		for (int i = 0; i < target.length; i++) {
			System.out.print(target[i] + "\t");
		}
		System.out.println();
		
		// Enhenced For
		//  증감 변수 필요 없이 순차 자료형 (배열 포함)의 각 요소를
		//  첫 번째 요소부터 끝까지 한 개씩 돌려준다
		
		for (int i : target) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
	
	public static void arrayCopySystem() {
		int source[] = {1, 2, 3};
		int[] target = new int[10];
		
		System.arraycopy(
				source,			// 원본배열
				0,				// 원본 시작인덱스
				target,			// 복사 대상 배열
				5,				// 대상 배열의 인덱스
				source.length	// 복사할 길이
				);
		for (int i : target) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
	}
	public static void main(String[] args) {
		// 
		//defineArray();
		//multiDim();
		//arrayCopy();
		arrayCopySystem();
	}

}
