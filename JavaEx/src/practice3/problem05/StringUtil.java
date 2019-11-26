package practice3.problem05;

public class StringUtil {
    
    public static String concatString(String[] strArray){
    	
        //메소드 내용작성
    	String resArray = "";
    	for (int i = 0; i < strArray.length; i++)
    	resArray += strArray[i];
        
    	return resArray;
    }

}
