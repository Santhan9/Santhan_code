package Encapsulation;

public class Car extends Vehicle {
	
	public Car(String name, int s, int no_tires,int doors,String AC) {
		super(name, s, no_tires);
		this.doors=doors;
		this.AC=AC;
		
	}

	private int doors;
	private String AC;

	public static void main(String[] args) {
		
		Car obj= new Car("BMW",300,4,4,"panasonic");
		
		//Vehicle obj=new Vehicle("BMW",300,4);
		
		/*obj.setName123("BMW");
		obj.setNo_tires(4);
		obj.setSpeed(300);*/
		
		System.out.println(obj.getName());
		System.out.println(obj.getNo_tires());
		System.out.println(obj.getSpeed());
		System.out.println(obj.doors);
		System.out.println(obj.AC);
		
		
		

	}

	/*public String getDoors() {
		return doors;
	}

	public void setDoors(String doors) {
		this.doors = doors;
	}

	public String getAC() {
		return AC;
	}

	public void setAC(String aC) {
		AC = aC;
	}*/
	
	

}
