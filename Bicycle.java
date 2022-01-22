package helloworld;

public class Bicycle {
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
	public Bicycle(int startSpeed, int startGear) {
		
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
