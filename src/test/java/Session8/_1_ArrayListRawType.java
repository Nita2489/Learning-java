package Session8;

import java.util.ArrayList;

public class _1_ArrayListRawType {

	public static void main(String[] args) {
		
		//Declaring it
		
		ArrayList ar = new ArrayList ();
		System.out.println("size of an array before storing something in it:" + ar.size());
		
		ar.add(400);
		ar.add(401);
		ar.add(402);
		ar.add(403);
		ar.add("test");
		
		System.out.println("1. After adding some values in arraylist the size is now:" +ar.size());
		
		for (int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
		
		System.out.println("the value at second index position for arraylist:" +ar.get(4));
		
		System.out.println("------------------------");
		// fresh arraylist
		ArrayList ar1 = new ArrayList();
		
		ar.add(100); //0
		ar.add(101); //1
		ar.add(102); //2
		ar.add(103); //3
		ar.add(104); //4
		
		System.out.println("the size of ar1 is:" +ar1.size());
		
		for(int j=0; j<=ar1.size(); j++)
		{
			System.out.println(ar1.get(j));
		}
		ar1.remove(1);
		
		System.out.println("now the size ofar1 is:" +ar1.size());
		System.out.println("-----------------");
		
		boolean ValidateTheValue105 = ar1.contains(105);
		if(ValidateTheValue105)
		{
			System.out.println("yes, i got it");
		}
		
		System.out.println(ValidateTheValue105);
		
		System.out.println("check ar1 is empty:" +ar1.isEmpty());
		
		
		
		
		
		
		
		
		

	}

}
