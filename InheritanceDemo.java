package helloworld;

public class InheritanceDemo {

	

	public static void main(String[] args) {
		MountainBike mountainBike= new MountainBike(10,1, 20);
		System.out.println("Gear is: "+mountainBike.getGear());
		System.out.println("Seat height is: "+ mountainBike.getSetHeight());
		System.out.println("Bike speed is: "+mountainBike.getSpeed());
		mountainBike.applyBreak(1);
		System.out.println("Bike speed after appling break is: "+mountainBike.getSpeed());

	}
	

}
