package com.bit.javaex.api.stringclass;

public class StringEx {
	
	public static void stringBasic() {
		//	문자열의 생성
		//	문자열 : char 형 데이터가 여러 개 연속으로
		//		연결된 자료
		//		* 한번 생성되면 변경되지 않는다(중요)
		String s1 = "Java";	//	Literal :
							//		실제 소스 코드에 직접
							//		입력한 문자열
		String s2 = new String("Java");
							//	메모리에 새로 생성된 문자열
		String s3 = "Java";	//	Literal
		//	문자열은 값이 같으면 같은 객체다
		
		System.out.println(s1 == s2);	//	s1, s2는 같은객체?
		System.out.println(s1 == s3);	//	s1, s3은 같은객체?
		
		//	문자열은 char 형의 집합이기 때문에
		//		char의 배열로 문자열을 생성할 수 있다.
		char[] letters = {'J', 'a', 'v', 'a'};
		String s4 = new String(letters);
		System.out.println(s4);	//	char 배열의 문자열
		
		//	기본 데이터 형 자료가 있을 때 -> 문자열로 변경
		//	-> valueOf 메서드
		String s5 = String.valueOf(3.14159);
		System.out.println(s5);
	}
	
	public static void methodsEx() {
		//	String 의 유용한 메서드들
		String str = "Java Programming is Fun?";
		
		//	길이 : .length() 메서드,
		System.out.println("length : " + str.length());
		
		//	변환 메서드
		System.out.println("UPPERCASE : " + str.toUpperCase());
		System.out.println("LOWERCASE : " + str.toLowerCase());
		//	문자열은 변경 불가 자료이기 때문에
		//		변환 메서드를 사용해도 원본은 바뀌지 않으므로
		//		새로 할당 받아야 한다.
		
		//	검색 관련 메서디
		System.out.println("contains : " + str.contains("Java"));
		
		//	5번 인덱스의 char은 무엇인가?
		System.out.println("charAt : " + str.charAt(5));
		System.out.println("indexOf : "
				+ str.indexOf("Fun"));
			//	문자열 내부에서 Fun의 index 변환
		System.out.println("lastIndexOf : "
				+ str.lastIndexOf("Fun"));
			//	검색 방향이 반대
		System.out.println("없는 검색어의 인덱스 : "
				+ str.indexOf("fun"));
		
		String str2 = "I Like Java, I Like Python";
		int i = str2.indexOf("Like");	// str2에서 Like위치
		System.out.println("Like index : " + i);
		i += "Like".length();
		i = str2.indexOf("Like", i);	// 두 번째 인자는 검색시작위치
		System.out.println("Like 2nd index : " + i);
		
		//	문자열 추출 : substring
		System.out.println(str.substring(5, 15));
		System.out.println(str.substring(5, 16));
			// -> Java에서는 왜 1을 더주어야되는지 모르겠다
		//	두 번째 인자값은 endIndex인데 endIndex 직전까지 추출
		
		//	끝까지 추출하는경우 2번째 인자 생략가능
		System.out.println("5부터 끝까지 :"
				+ str.substring(5, str.length()));
		System.out.println("5부터 끝까지 :"
				+ str.substring(5));
		
		//	치환 메서드 : replace
		//	str2 : "I Like Java, I Like Python";
		//	str2의 Like를 like로 변환
		System.out.println(str2.replace("Like", "like"));
		
		//	공백 문자 제거 : trim()
		String str3 = "       Hello     ";
		str3 = str3.trim();
		System.out.println("trim : " + str3);
		
		//	문자열 분리 : split()
		String[] chunks = str.split(" ");
		
		for (String word : chunks) {
			System.out.println("word : " + word);
		}
		
	}
	
	public static void stringBufferEx() {
		//	String 버퍼는 내부에 버퍼(임시공간)을
		//		가지고 있는 자료형
		//		-> String 객체가 매번 새 객체를 생성하는데 반해
		//		StringBuffer는 내부 버퍼에서 모든 작업을 수행함
		//		-> 메모리 효율이 좋다
		//		This is my pencil
		StringBuffer sb = new StringBuffer("This");
		//		기본 10글자 버퍼
		System.out.println(sb.append(" is pencil"));
		System.out.println(sb.insert(7, " your"));
		System.out.println(sb.replace(7, 12, " my"));
		sb.setLength(5);
		System.out.println(sb);
		
		//	메서드 체이닝
		StringBuffer sb2 = new StringBuffer("This")
				.append(" is")
				.append(" pencil")
				.insert(7, " your")
				.replace(7, 12, " my");
		String s = sb2.toString();
		System.out.println(s);
		
	}
	
	
	
	public static void main(String[] args) {
		
		//stringBasic();
		//methodsEx();
		stringBufferEx();
	}

}
