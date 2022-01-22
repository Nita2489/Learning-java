package _15_._1_Constructors;

public class _2_Employee {
	// class variable
		String name;
		int age;
		String dept;
		int empId;
		static String comName = "Unicorn System";
		
		//Constructors is a way it get called when we create an object
		//points
		//1. No return type
		//2. same name as a class name
		//3. if not provided java will provide it internally
		//4. Types - i. default, ii. UserDefined -> (zero parameter and with parameters)
		//5. Constructors can be overloaded
		
		public _2_Employee() // Zero parameter constructor _User defined.
		{
			System.out.println("User Defined Zero Parameter constructor");
		}
		
		public _2_Employee(int i) // one parameter constructor
		{
			System.out.println("one parameter const" +i);
		}
		public _2_Employee(String s)
		{
			System.out.println("one parameter const" +s);
		}
		
		//creat const will all emp vars initialized
		
		public _2_Employee(String name1, int age1, String dept1, int empId1)
		{
			name= name1;
			age= age1;
			dept= dept1;
			empId= empId1;
			
		}
		public _2_Employee(String name1,int empId1)
		{
			name= name1;
			empId= empId1;
		}
		
		public static void main(String[] args)
		{
			System.out.println("---------zero parameters----------");
			_2_Employee e0 = new _2_Employee();

			
		    System.out.println("----------one parameter-----------");
		    _2_Employee e1 = new _2_Employee("Hi");
		    _2_Employee e2 = new _2_Employee("Akshay");
		    
		    
		    System.out.println("---------------------------------");
		    _2_Employee e3 = new _2_Employee("Jeff", 35, "Admin", 102);
		    _2_Employee e4 = new _2_Employee("Nita", 27, "Admin", 103);
		    _2_Employee e5 = new _2_Employee("Akshay", 32, "Admin", 104);
		    
		    
		    System.out.println("---------------------------------");
		    System.out.println(e3.name + " " + e3.age + " " + e3.dept + " " + e3.empId + " " + comName);
		    System.out.println(e4.name + " " + e4.age + " " + e4.dept + " " + e4.empId + " " + comName);
		    System.out.println(e5.name + " " + e5.age + " " + e5.dept + " " + e5.empId + " " + comName);
		    
		    _2_Employee e6 = new _2_Employee("Max", 111);
		    System.out.println("For newely joined employee ->" + e6.name + " " + e6.empId + " " + comName);
		  
		
		}

}
