package Session5;

public class Switchcase {
	public static void main(String[] args)
	{
		// Used to check multiple conditions
		//switch case is more faster in terms of execution
		
		//Example - 1
		int num = 9;
		if (num == 1)
		{
			System.out.println("number is one");
			
		}else if(num == 2)
		{
			System.out.println("number is two");
		}else
		{
			System.out.println("please enter number within zero to nine");
		}
		
		// Switch case
		switch (num) 
		{
		case 0:
			System.out.println("number zero");
			break;
		case 1:
			System.out.println("number one");
			break;
		case 2:
			System.out.println("number two");
			break;
		case 3:
			System.out.println("number three");
			break;

		default:
			System.out.println("enter number from zero to five");
			break;
		}
		
		//
		int digit = 2;
		switch (digit)
		{
		case 0:
			System.out.println("hi");
		case 1:
			System.out.println("hello");
			break;

		default:
			
			break;
		}
		
		// chrome, opera, and edge only not safari
		String browser = "abcd" ;
				switch (browser)
				{
				case "chrome":
					System.out.println("launching up chrome");
					break;
				case "opera":
					System.out.println("launching up opera");
					break;
				case "edge":
					System.out.println("launching up edge");
					break;

				default:
					System.out.println("please enter only chrome, opera, and edge");
					break;
				}
	}

}
