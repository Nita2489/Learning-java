package Session10;

public class _1_Webpage {

 
		//To creat a class
		//it should not startwith number classname
		//variables
		
		String title ="Welcome to amazon";
		String url = "https://ww.amazon.in";
		String header ="Amazon.in:mobile";
		String logoimage = "https://www.amazon.in/ref = nav_logo";
		
		//Non static method
		
		public void topPannel()
		{
			System.out.println("--------------------Top pannel start---------------------");
			System.out.println(url);
			System.out.println("This is the top pannel of the url");
			System.out.println(title);
			System.out.println(logoimage);
			System.out.println("------------------Top pannel end--------------------------");
		}
		
		public void centerPannel()
		{
			System.out.println("-------------------center pannel start--------------------");
			System.out.println("Mobile");
			System.out.println("Laptop");
			System.out.println("Books");
			System.out.println("TV");
			System.out.println("-------------------center pannel end-----------------------");
		}
		
		public void footerLinks()
		{
			//logic
			System.out.println("----------------footerLink start-----------------------");
			System.out.println("Links -1");
			System.out.println("Links -2");
			System.out.println("Links -3");
			System.out.println("-----------------footerLink end------------------------");
		}
		public static void helpSection()
		{
			//logic
			System.out.println("-------------helpsection start-----------------------");
			System.out.println("Location");
			System.out.println("privacy note");
			System.out.println("about the appication");
			System.out.println("-------------helpsection end--------------------------");
		
		}
		
		public static void main(String args[])
		{
			_1_Webpage Webpage_1=new _1_Webpage();
			Webpage_1.topPannel();
			Webpage_1.centerPannel();
			Webpage_1.footerLinks();
			helpSection();
			
			_1_Webpage Webpage_2=new _1_Webpage();
			Webpage_2.topPannel();
			Webpage_2.centerPannel();
			Webpage_2.footerLinks();
			helpSection();
					
		}
	
}


