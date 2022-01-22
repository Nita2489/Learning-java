package Session12;

public class _2_Car {
	String name;
	int price;
	private String colour;
	
	
	static int wheels = 4;
	
	public static void main(String[] args) {
		
		_2_Car SportsCar = new _2_Car();
		SportsCar.name = "BMW";
		SportsCar.price= 5_000; //usd
		SportsCar.colour = "sterling black";
		//SportsCar.wheel = 5;
		
		System.out.println("------sports car details------");
		System.out.println(SportsCar.name);
		System.out.println(SportsCar.price);
		System.out.println(SportsCar.colour);
		System.out.println(wheels);
		System.out.println("------------------------------");
		
		
		_2_Car PassangerCar = new _2_Car();
		PassangerCar.name = "BMW";
		PassangerCar.price= 6_000; //usd
		PassangerCar.colour = "sterling White";
		
		System.out.println("------passanger car details------");
		System.out.println(PassangerCar.name);
		System.out.println(PassangerCar.price);
		System.out.println(PassangerCar.colour);
		System.out.println(wheels);
		System.out.println("------------------------------");
		
		
		
		
	}

}
