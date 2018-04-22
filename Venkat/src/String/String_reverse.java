package String;

public class String_reverse {

	public static void main(String[] args) {
		
		
		String input = "Santhan";
		
		char[] c= new char[input.length()];
		
		c= input.toCharArray();
		System.out.println(c);
		
		for(int i=c.length;i>0;i--) {
			
			System.out.print(c[i-1]);
			
		}
		
		

	}

}
