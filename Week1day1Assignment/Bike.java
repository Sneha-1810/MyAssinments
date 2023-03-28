package Week1day1Assignment;

public class Bike {
	public void applyBreak() {
		System.out.println(" Bike Applied Break ");
	}

	public void soundHorn() {
		System.out.println(" Bike sound horn");
	}

	public static void main(String[] args) {
		
		Car tata = new Car();
		tata.applyBreak();
		tata.soundHorn();
		Bike honda = new Bike();
		honda.applyBreak();
		honda.soundHorn();

	}

}
