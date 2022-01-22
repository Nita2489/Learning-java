package Session_1_Abstraction._1_By_Interface;

public interface _1_USMedical extends _0_WHO {
	
	int min_fee =10; //by default value
	public void PhysioService(); //Abstract (Prototype) method
	public void oncologyServices(); //Abstract (Prototype) method
	public void orthopedicServices(); //Abstract (Prototype) method
	public void RadoiLogyServices(); //Abstract (Prototype) method[Common service also available in other services]
	
	//can not creat the object interface
	//only method declairation -- method prototype--normal body--abstract method
	//can not create static abstract method in interface - because we can not create override methods
	//example
	//public staic void services();
	//interface variable final and anstract by default
	//from JDK1.8 you can have static method in interface but with method body
	
	//static method with method body
	public static void Services_911() {
		System.out.println("US _911 Services---");
		}
	
	//default method can be overriden
	default void intership() {
		System.out.println("US -intership----");
	}

}
