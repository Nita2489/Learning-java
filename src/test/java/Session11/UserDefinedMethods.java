package Session11;

public class UserDefinedMethods {
	
	
	//no input no return method
	//1.
	
	public void test()
	{
		System.out.println("This is the method");
	}
	
	//no input some return
	//ex -2
	
	public String nameOfCountry()
	{
		String CountryName = "India";
		return CountryName;
	}
	//ex -3
	public String ListOfStudent()
	{
		System.out.println("Student list:");
		String names[] = new String[3];
		names[0] = "person1";
		names[1] = "person2";
		names[2] = "person3";
		return names;
		
		//Ex. - 3
		//some input with some return
		//3.1
//		public void addPrintOnly(int a, int b)
//		{
//			int c = a +b;
//			System.out.println(c);
//		}
//		
//		public int addReturn(int a, int b)
//		{
//			int c = a+b;
//			Return c;
//		}
//		
		
		
		// 3.2
		 public String FactoryName(String NameofFactory)
		{
			if(NameofFactory.equals("nike"));
		{
  		String fact1 = "@@nike@@";
		System.out.println("Hay this is nike factory");
		return fact1;
		}
		
			if(NameofFactory.equals("puma"));
			{
	  		String fact2 = "@@puma@@";
			System.out.println("Hay this is puma factory");
			return fact2;
			}
			
			return "no factory found with given criteria";
		}
		 
		 public String country(String NameOfCountry)
		 {
			 
		 }
			
		
	}

	public void addPrintOnly(int intFirst, int intSecond) {
		// TODO Auto-generated method stub
		
	}
	

}
