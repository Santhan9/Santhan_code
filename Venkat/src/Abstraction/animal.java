package Abstraction;

public abstract class animal {
	
	
	
	public void fly() {
		
		System.out.println("flying");
		
	}
	
	public void run() {
		System.out.println("Running");
	}
	
	public abstract void  walk();
	
	public abstract void breath(int a);
	
	public abstract void see();

}
