package Week1day1Assignment;

public class Mobile {

	public void makeCall() {

		String mobileModel = "onePlus";
		System.out.println(mobileModel);
		float mobileWeight = 58.6f;
		System.out.println(mobileWeight);

	}
	public void sendMsg() {

		boolean FullCharged = true;
		System.out.println(FullCharged);
		int mobileCost = 50000;
		System.out.println(mobileCost);

	}


	public static void main(String[] args) {

		Mobile x = new Mobile();
		x.makeCall();
		x.sendMsg();

		System.out.println("This is my Mobile");



	}

}
