package String;

public class String_Swap {

	public static void main(String[] args) {
		
		String a= "Hello";
		String b= "World";
		System.out.println("a"+a);
		System.out.println("b"+b);
		
		a=a+b;
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		System.out.println("b"+b);
		a=a.substring(b.length());
		System.out.println("a"+a);

	}

}
