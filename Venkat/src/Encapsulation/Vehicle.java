package Encapsulation;

public class Vehicle {
	
	private String name;
	
	private int speed;
	
	private  int no_tires;
	
	
	
	
	public String getName() {
		return name;
	}


	

	public int getSpeed() {
		return speed;
	}


	


	public int getNo_tires() {
		return no_tires;
	}


	


	public Vehicle(String name, int s, int no_tires) {
		this.name=name;
		this.speed=s;
		this.no_tires=no_tires;
		
	}

}
