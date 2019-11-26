package practice4.problem02;

public class SmartPhone extends MusicPhone {
    
	/*	실행결과 : 
	 * 	앱실행
	 * 	다운로드해서 음악재생
	 * 	통화기능시작
	 */
    public void execute(String str){
        
        //코드작성
    	//	Override
    	if ("앱".equals(str)) {
    		System.out.println("앱실행");
    	} else if ("음악".equals(str)) {
    		System.out.println("다운로드해서 음악재생");
    	} else {
    		super.execute(str);
    	}
        
    }

}
