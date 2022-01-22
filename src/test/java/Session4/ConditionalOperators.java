package Session4;

public class ConditionalOperators {
	public static void main(String[] args) {
		//1. == : Comparison
		//2. >,<,<=,>=
		//3. $$ : AND(short circuit operator)
		//5. || : OR
		
		int a = 10;
		int b = 20;
		//1
		if(a > b)
		{
			System.out.println("A is greater than B");
		}else
		
		{
			System.out.println("B is greater than A");
			
		}
		System.out.println("-----------------------------");

		//2
		if(a > b)
		{
			System.out.println("A is greater than B");
		}else if(b>a)
		{
			System.out.println("B is greater than A");
		
		}
		else
		{
			System.out.println("A & B are equal");
		}
			
		System.out.println("-----------------------");
		
		//not equal to
		
		int total = 100;
		if(!(total == 0)) //total should not be zero, and then customer is eligible for 10 rupees discount.
			
		{
			System.out.println("give him 10 rupees discaunt");
		}
		else
			
		{
			System.out.println("no discount");
		}
		
		System.out.println("-------------------------");
		
		
		// to check the variable q is having value equal to 5
		
		int q = 5;
		if(q == 5)
		{
			System.out.println("q having value equal to 5");
		}
		System.out.println("---------------------------");
		
		int e = 9;
		if(e>10)
		{
			if(e == 15)
			{
			System.out.println("e is equal to 5");
			}
			if(e == 17)
			{
				System.out.println("e is equal to 17");
			}
			else
			{
				System.out.println("e is not 15 or even 17");
			}
		}
		else
		{
			System.out.println("condition not satisfide");
		}
		System.out.println("-------------------------");
		
		//WAP to find highest among 3 no.s
		
		int X = 100;
		int y = 200;
		int z = 300;
		
		if(X>y && X>z)
		{
			System.out.println("X is heighest");
		}
		else if(y>z)
		{
			System.out.println("Y is heighest");
		}
		else
		{
			System.out.println("Z is heighest");
		}
		System.out.println("-------------------------");
		
		String Username = "zoe";
		if(Username == "toe" || Username == "zoe")
		{
			System.out.println("hey developer");
		}
		else if(Username == "steve" || Username == "akshay")
		{
			System.out.println("hey among qa");
		}
		else
		{
			System.out.println("how may i can help you");
		}
		System.out.println("---------------------");
	
		int c = 10;
		if(true)
		{
			System.out.println("A");
		}
		else
		{
			System.out.println("B");
		}
	}

	}
 