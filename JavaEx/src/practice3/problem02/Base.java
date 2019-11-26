package practice3.problem02;

public class Base {
    
	private String state;
	
	public void service(String state) {
		
        this.state = state;
        if (this.state.equals("낮")) {
        	day();
        } else if (this.state.equals("밤")) {
        	night();
        } else if (this.state.equals("오후")) {
        	afternoon();
        }
    }

    private void day() {
        System.out.println("낮에는 열심히 일하자");
    }

    private void night() {
        System.out.println("night");
    }
    
    private void afternoon(){
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }

}
