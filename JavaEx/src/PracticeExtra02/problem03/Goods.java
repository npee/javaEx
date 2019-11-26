package PracticeExtra02.problem03;

import java.util.Iterator;
import java.util.List;

public class Goods {

    private String name;
    private int price;
    private int count;
    
    public String getName() {
    	return name;
    }
    
    public void setName(String name) {
    	this.name = name;
    }
    
    public int getPrice() {
    	return price;
    }
    
    public void setPrice(int price) {
    	this.price = price;
    }
    
    public int getCount() {
    	return count;
    }
    
    public void setCount(int count) {
    	this.count = count;
    }
    
    public void printList() {
    	
    	System.out.printf("%s(가격:%d원)이 %d 개 입고 되었습니다.%n", getName(), getPrice(), getCount());
    }
    
    public void printTotal(List<Goods> goods) {
    	int total = 0;
    	Iterator<Goods> it = goods.iterator();
    	
    	while(it.hasNext()) {
    		total += it.next().getCount();
    	}

    	System.out.println("모든 상품의 갯수는 " + total + "개 입니다.");
    }
    
}
