package Session_13;

public class _1_StaticAndNonStaticConcept {
	//Data member of class
	
	//variables
	String name ;
	static int age = 25;
	
	//Methods
	public void getName()
	{
		System.out.println("get name");
	}
	
	public static void getStart()
	{
		System.out.println("get start");
	}
	
	public static void main(String args[]) {
	
	//How to call static method and variables
	
	System.out.println("-------How to call static method and variables--way 1------------------");
	getStart();
	System.out.println(age);
	System.out.println("---------------------------");
	
	System.out.println("------------------way 2------------------");
	_1_StaticAndNonStaticConcept objref = new _1_StaticAndNonStaticConcept();
	objref.getStart();
	System.out.println(objref.age);
	System.out.println("-----------------------------------------");
	
	System.out.println("---------------Way 3----------------------");
	_1_StaticAndNonStaticConcept.getStart();
	System.out.println(	_1_StaticAndNonStaticConcept.age);
	
	
	//How to call non static method and variables
	System.out.println("-----How to call non static method and variables-----way 1--");
	_1_StaticAndNonStaticConcept objref1 = new _1_StaticAndNonStaticConcept();
	objref1.getName();
	objref1.name = "Tom";
	System.out.println(objref1.name);
	System.out.println("------------------------------");
	
	System.out.println("-------------------------------");
	new _1_StaticAndNonStaticConcept().getStart();
	System.out.println(new _1_StaticAndNonStaticConcept().age);
	new _1_StaticAndNonStaticConcept().getName();
	System.out.println(new _1_StaticAndNonStaticConcept().name = "akshay");
	
	System.out.println("-------------------------------");
	
	
	
	
	}
	
	

}
