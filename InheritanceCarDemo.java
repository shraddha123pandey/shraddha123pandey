package helloworld;

class Car {
	private int gear;
	private int speed;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getGear() {
		return gear;
	}
	public Car(int startSpeed, int startGear) {
		
		gear= startGear;
		speed = startSpeed;
		
	}
	public void setGear(int newGear) {
		gear= newGear;
		
	}
	public void applyBreak(int decrement) {
		speed-= decrement;
	}
	public void speedUp(int decrement) {
		speed+= decrement;
	}
	
}
class Negi extends Car{
	
	public Negi(int startSpeed, int startGear) {
		super(startSpeed, startGear);
		// TODO Auto-generated constructor stub
	}

	private int setHeight;

	public int getSetHeight() {
		return setHeight;
	}

	public void setSetHeight(int setHeight) {
		this.setHeight = setHeight;
	}

	public Negi(int startSpeed, int startGear, int startHeight) {
		super(startSpeed, startGear);
		this.setHeight= startHeight;
		
	}
}

public class InheritanceCarDemo {

	

	public static void main(String[] args) {
		Negi car= new Negi(10,1, 20);
		System.out.println("Gear is: "+car.getGear());
		System.out.println("Seat height is: "+ car.getSetHeight());
		System.out.println("Bike speed is: "+car.getSpeed());
		car.applyBreak(1);
		System.out.println("Bike speed after appling break is: "+car.getSpeed());

	}
	

}

