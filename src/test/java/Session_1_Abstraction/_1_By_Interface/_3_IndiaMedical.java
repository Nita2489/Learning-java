package Session_1_Abstraction._1_By_Interface;

public interface _3_IndiaMedical extends _0_WHO{
	
	public void emergencyServices();//Abstract (Prototype) method
	public void neuroServices();//Abstract (Prototype) method
	public void peditricServices();//Abstract (Prototype) method
	public void RadioLogyServices();//Abstract (Prototype) method[Common service also available in other services]
	
	
	public static void dengueServices() {
		System.out.println("Indian--dengueServices");
	}

}
