package Assingment1;

import java.util.Scanner;

public class billamt {
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int bill = sc.nextInt();
		sc.close();
	
		if (bill <=300 ) 
		
		{
			System.out.println("Enter bill amount:" +(bill + 50));
		}
		else if( bill >= 300 || bill<=500)
		{
			System.out.println("enter bill amount:" +(bill + 20));
		}
		else if(bill >= 1000)
		{
			System.out.println("bill amount is more than 1000 then no tax to the amount");
		}
	
		
		
		
		
	}

}
