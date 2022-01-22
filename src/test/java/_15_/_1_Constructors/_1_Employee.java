package _15_._1_Constructors;

public class _1_Employee {
// class variable
	String name;
	int age;
	String dept;
	int empId;
	static String comName = "Unicorn System";
	
	public static void main(String args[])
	{
		_1_Employee e1 = new _1_Employee();
		e1.name = "Nita";
		e1.age = 27;
		e1.dept = "testing";
		e1.empId = 101;
		
		_1_Employee e2 = new _1_Employee();
		e2.name = "Akshay";
		e2.age = 31;
		e2.dept = "testing automation";
		e2.empId = 102;
		
		System.out.println("------emp 1st info---------");
		System.out.println("name"+ " =" +e1.name);
		System.out.println("age"+ " =" +e1.age);
		System.out.println("dept"+ " =" +e1.dept);
		System.out.println("empId"+ " =" +e1.empId);
		System.out.println("comName"+ " =" +e1.comName);
		
		System.out.println("------emp 2nd info---------");
		System.out.println("name"+ " =" +e2.name);
		System.out.println("age"+ " =" +e2.age);
		System.out.println("dept"+ " =" +e2.dept);
		System.out.println("empId"+ " =" +e2.empId);
		System.out.println("comName"+ " =" +e2.comName);
		
		
	}
	
	
}
