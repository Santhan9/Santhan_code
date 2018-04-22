package Inheritence;



public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		ClassB obj= new ClassB();
		
		obj.method1();

	}
	
	public void message() {
		System.out.println("ClassB");
	}

}
