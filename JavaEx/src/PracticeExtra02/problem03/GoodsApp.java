package PracticeExtra02.problem03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	List<Goods> list = new ArrayList<>();
    	System.out.println("상품 3개를 입력해주세요");
    	
    	Scanner s = new Scanner(System.in);
    	
    	for (int i = 0; i < 3; i++) {
    		
    		String str = s.nextLine();
    		String[] temp = new String[3];
    		
    		temp = str.split(" ");
    		
    		Goods goods = new Goods();
    		
    		goods.setName(temp[0]);
    		goods.setPrice(Integer.parseInt(temp[1]));
    		goods.setCount(Integer.parseInt(temp[2]));
    		
    		list.add(goods); 
    	}
    	Goods g = new Goods();
    	for (int i = 0; i < 3; i++) {
    		list.get(i).printList();
    	}
    	
    	g.printTotal(list);
	     
    	s.close();
    }

}
