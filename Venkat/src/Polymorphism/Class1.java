package Polymorphism;

public class Class1 {

	public static void main(String[] args) {
		
		Class1 obj= new Class1();
		
		obj.method1();
		obj.method1(20);
		obj.method1("Santhan");
		obj.method1(20, 30);
		obj.launch("");
		obj.login("", "");
		

	}
	
	
	public void method1() {
		System.out.println("With out parameters");
	}
	
	
	public void method1(int a) {
		System.out.println("With integer parameter "+a);
	}
	
	public void method1(String a) {
		System.out.println("with String parameter "+ a);
	}
	
	public void method1(int a,int b) {
		System.out.println(a+b);
		
	}
	
	public void launch(String URL) {
		
	}
	
	public void login(String username,String Password) {
		
	}

}
