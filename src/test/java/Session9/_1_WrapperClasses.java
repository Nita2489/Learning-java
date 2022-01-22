package Session9;

public class _1_WrapperClasses {

	public static void main(String[] args) {
		//How to convert a data form a form to another
		//1. String to integer
		
		System.out.println("String to Integer");
		String X = "100";
		System.out.println(X+10); // 10010
		
		String X1 ="200";
		int a = 300;
		System.out.println(X1+a); //200300
		
		int a1 =10;
		int a2 =20;
		System.out.println(a1+a2); //30
		
		String price ="750";
		int charge = 50;
		System.out.println(price + charge); //75050
		System.out.println("--------------------------");
		
		int conValOfPrice = Integer.parseInt(price);
		
		//price value got converted into integer 750
		System.out.println(conValOfPrice + charge);
		
		System.out.println("--------------------------");
		//2. IntegerToString
		System.out.println("100"+10); //10010
		System.out.println(100+10);//110
		
		System.out.println("--------------------------");
		
		int vat = 10;
		System.out.println(vat+20);
		
		System.out.println("--------------------------");
		String con_val_of_vat = String.valueOf(vat);
		System.out.println(con_val_of_vat);
		System.out.println(con_val_of_vat +20);
		
		System.out.println("--------------------------");
		//String to double
		
		System.out.println("String to double");
		String MemorySize = "8.2";
		System.out.println(MemorySize+8);
		double converted_memory_value = Double.parseDouble(MemorySize);
		System.out.println(converted_memory_value+10);		
		
		
		
	
		
		
		
		
		
		
		
		
		
	 
	

	}

}
