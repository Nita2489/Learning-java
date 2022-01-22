package Session12;

import java.util.Scanner;

import Session11.UserDefinedMethods;



public class InputToUser {

	public static void main(String[] args) 
	{
		UserDefinedMethods refvar	= new UserDefinedMethods();
		//refvar.addPrintOnly (50,20);
	
	System.out.println("Please enter 2 values to be get added-------");
	Scanner sc = new Scanner(System.in);
	int intFirst = sc.nextInt();
	int intSecond = sc.nextInt();
	sc.close();
	
	refvar.addPrintOnly(intFirst, intSecond);
		
		

	}

}
