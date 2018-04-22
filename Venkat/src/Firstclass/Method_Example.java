package Firstclass;

public class Method_Example {

	public static void main(String[] args) {
		
		Method_Example obj= new Method_Example();
		
		int a;
		
		a= obj.reservation(24);
		obj.cancel();
		
		System.out.println(a);
		

	}
	
	
	
	public int reservation(int ticket_number) {
		
		System.out.println("Reservation successfull");
		
		return ticket_number;
		
		
	}
	
	public void cancel() {
		System.out.println("Ticket cancled");
		
		
	}
	

}
