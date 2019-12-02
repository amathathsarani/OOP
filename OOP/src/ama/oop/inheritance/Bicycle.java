package ama.oop.inheritance;

public class Bicycle {

	public int gear;
	public int speed;
	
	//A subclass does not inherit the private members of its parent class.
	private float price ;
	
	public Bicycle(int gear, int speed) {

		this.gear = gear;
		this.speed = speed;
	}

	

	public String toString() {
		return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
	}

}
