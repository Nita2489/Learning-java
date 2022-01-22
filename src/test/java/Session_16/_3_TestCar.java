package Session_16;

public class _3_TestCar {
	public static void main(String[] args) {
		
		System.out.println("--------------------");
		_2_BMW b = new _2_BMW();
		b.stop();
		b.start();
		b.fillfuel();
		b.autoParking();
		b.engine();
		
		System.out.println("--------------------");
		_1_Car c = new _1_Car();
		c.stop();
		c.start();
		c.fillfuel();
		c.engine();
		//c.autoParking();
	
		System.out.println("--------------------");
		//Top Casting/Upcasting
		
		_1_Car c1 = new _2_BMW();
		c1.start();
		c1.stop();
		c1.fillfuel();
		//c1.autoParking();
		
		
		System.out.println("--------------------");
		//Top casting/Upcasting
		
		_1_Car c2 = new _2_BMW();
		c2.start();
		c2.stop();
		c2.fillfuel();
		//c2.autaParking();
						
	}
	

}
