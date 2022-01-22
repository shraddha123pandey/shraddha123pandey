package helloworld;

public class MountainBike extends Bicycle {
	private int setHeight;

	public int getSetHeight() {
		return setHeight;
	}

	public void setSetHeight(int setHeight) {
		this.setHeight = setHeight;
	}

	public MountainBike(int startSpeed, int startGear, int startHeight) {
		super(startSpeed, startGear);
		this.setHeight= startHeight;
		
	}
}

