package practice4.problem03;

public abstract class Bird {
	//	field
    private String name;
    
    //	constructor

    //	method(abstract)
    
    public void setName(String name) {
    	this.name = name;
    }
    protected String getName() {
    	return name;
    }
    
    public abstract void fly();
    public abstract void sing();
    public abstract void showName();
}

