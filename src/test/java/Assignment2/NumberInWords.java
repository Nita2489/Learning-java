package Assignment2;

import java.util.Scanner;

public class NumberInWords {

	public static void main(String[] args) {
		
		
	    System.out.println("enter your number :");
		Scanner sc=new Scanner (System.in);
		int number=sc.nextInt();
		sc.close();
		
		
		switch (number) {
		case 0 :
			System.out.println("Number is zero");
			break;
		case 1:
			System.out.println("Number is one");
			break;
		case 2:
			System.out.println("Number is two");
			break;
		case 3:
			System.out.println("Number is three");
			break;
		case 4:
			System.out.println("Number is four");
			break;
		case 5:
			System.out.println("Number is five");
			break;
		case 6:
			System.out.println("Number is six");
			break;
		case 7:
			System.out.println("Number is seven");
			break;
		case 8:
			System.out.println("Number is eight");
			break;
		case 9:
			System.out.println("Number is nine");
			break;
		default:
			System.out.println("Enter a number between Zero to Nine ");
			break;
		}
		
				
	}

}



