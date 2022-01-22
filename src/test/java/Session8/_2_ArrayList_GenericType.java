package Session8;

import java.util.ArrayList;

public class _2_ArrayList_GenericType {

	public static void main(String[] args) {
		
		//Declaring it
		
		ArrayList ar = new ArrayList ();
		System.out.println("Size of a array before somthing in it :" + ar.size());
		
		ar.add(100); //0
		ar.add(200); //1
		ar.add("test"); //2
		ar.add(300); //3
		ar.add(400); //4
		
		ArrayList<String>ar2 = new ArrayList<String>();
		
		ar2.add("Tom"); 
		ar2.add("peter");
		ar2.add("mark");
		
		System.out.println(ar2.size());
	    for(int i=0; i<ar2.size(); i++)
	    {
			System.out.println(ar2.get(i));
		}
	    System.out.println("----------------------");
		ArrayList <Integer> ar3 = new ArrayList <Integer>();
		
		ar3.add(505);//0
		ar3.add(5015); //1
		System.out.println(ar3.get(0));
		System.out.println("----------------------");
		
		ArrayList <Object> ar4 = new ArrayList <Object>();
		ar4.add("Tom");
		ar4.add(24);
		ar4.add(true);
		
		System.out.println(ar4.size());
	    for(int i=0; i<ar4.size(); i++)
	    {
			System.out.println(ar4.get(i));
		}
		
		
	
	}

}
