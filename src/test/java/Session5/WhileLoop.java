package Session5;

public class WhileLoop {
	public static void main(String[] args)
	{
		//loops are used for iteration either from positive negative side
		
		System.out.println("0");
		System.out.println("1");
		System.out.println("2");
		System.out.println("3");
		
		
		System.out.println("-------------------");
		//while loop
		int i = 1;   //start point
		System.out.println("following are values of m : ");
		while(i<20)
		{
			System.out.println(i);
		    i++;
		}
		
		
		
		System.out.println("---------------------");
		
		int j = 0;
		while(j<=10)
		{
			System.out.println(j);
		
	    if(j == 5)
		{
			System.out.println("i got five no.");
			break;
		}
	   j++;
		}
		
		
	}

}
