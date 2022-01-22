package Session7;

public class ArraysInJava {

	public static void main(String[] args) {
		
		int i =10;
		i = 20;
		 System.out.println(i);
		 i = 30;
		 
		 
		 System.out.println("---------------------");
		 int[] q = new int[4]; //0 1 2 3
		 int x[] = new int[3]; //0 1 2
		 int []y = new int[3]; //0 1 2
		 
		 int z[] = {11, 22, 33 };
		 //          0   1  2
		 
		for(int count=0; count<=2; count++)
		{
			 System.out.println(z[count]);
		}
		
		
		 System.out.println("---------------------");
		 q [0] = 40;
		 q [1] = 50; 
		 q [2] = 60;
		 q [3] = 70;
		 
		 for(int j=0; j<=3; j++)
		 {
			 System.out.println(q[j]+10);
		 }
		 
		 System.out.println("---------------------");
		 //check whether no. 22 is there in the given array
		 
		 int test[] = new int[3]; //0 1 2
		     test[0] = 10;
		     test[1] = 11;
		     test[2] = 22;
		     
		     for (int q1=0; q1<=2; q1++)
		    	 if(test[q1] == 22);
		     {
		    	 System.out.println("i found no. 22");
		     }
		 //    else
		   //  {
		    //	 System.out.println("not fount no. 22");
		     //}
		     
			 System.out.println("---------------------");
			 double k1[] = new double[7]; // 0 1 2 3 4 5 6 
			 
			 k1[0] = 11.22;
			 k1[1] = 12.22;
			 k1[2] = 13.22;
			 k1[3] = 14.22;
			 k1[4] = 15.22;
			 k1[5] = 16.22;
			 k1[6] = 17.22;
			 
			// for(int j=0; j< k1.length ; j++)
			 //{
				// System.out.println(k1[j]); 
			 //}
			 
			 System.out.println(k1[5]);
			 
			 System.out.println("------------------------------");
			 String browser[] = new String [4];
			 browser[0] = "Chrome";
			 browser[1] = "opera";
			 browser[2] = "firefox";
			 browser[3] = "safari";
			 
			 for(int j=0; j<=3; j++)
			 {
				 System.out.println(browser[j]);
			 }
			 
			 System.out.println("-----------------------------");
			 
			 for(int j=3; j>=0; j--)
			 {
				 System.out.println(browser[j]);
			 }
			 
			 System.out.println("------------------------------");
			 for(int j=3; j>=0; j--)
				 if(browser[j].equals("Chrome"))
				 {
					 System.out.println("Chrome is launch");
				 }
			 
			 System.out.println("------------------------------");
			 //name, age, salary, gender,true/false
			 
			 Object emp[] = new Object[5];
					 
			 emp[0] = "akshay";
			 emp[1] = "22";
			 emp[2] = "24.45";
			 emp[3] = "m";
			 emp[4] = "false";
			 
			 
			 for(int j=0; j<emp.length; j++)
			 {
				 System.out.println(emp[j]); 
			 }
			 
			 System.out.println("------------------------------");
			 Object emp23[] = {"nita", 22, true, "F", 22.24};
			 for(int j=0; j<emp23.length; j++)
			 {
				 System.out.println(emp23[j]);
			 }
			 
			 
			 
			 
		     
		 
		

	}

}
