package practice3.problem04;

public class CConverter {
    
    public static double rate;
    
    public static void setRate(double r){
        CConverter.rate = r;
    }
    
    public static double toDollar(double won){
        return won / rate;
    }

    public static double toKWR(double dollar){
        return dollar * rate;
    }
    

}
