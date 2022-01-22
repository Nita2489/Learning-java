package Session6;

public class StringManupulations {

	public static void main(String[] args) {
		// length of a string
		
		String str1 = "Hello everyone lets learn something about string";
		
		System.out.println("The length of String str1 :" + str1.length());
		
		int lengthOfString = str1.length();
				System.out.println("length is :" + lengthOfString);
				
	System.out.println("----------------");
	
	//find character at specific index position
	String str2 = "i am learning string in java";
	System.out.println(str2.length());
	System.out.println("char at second index position is :" + str2.charAt(26));
	System.out.println("------------------");
	
	
	//find a number of a char in a string
	
	String str3 = "Hello there";
	System.out.println(str3.length());
	System.out.println("index position of char o is :" + str3.indexOf('o'));
	str3.indexOf('o');
	System.out.println("--------------------");
	
	//check the multi occurrence
	
	System.out.println(str3.indexOf('e', 2));
	System.out.println(str3.indexOf('e') + 1);
	System.out.println(str3.indexOf('e', str3.indexOf('e')+1));
	System.out.println("--------------------");
	
	String test = "Heello";
	System.out.println(test.indexOf('e',test.indexOf('e') +1));
	System.out.println("--------------------");
	
	//finding a specific word
	String str4 = "hay there how are you";
	System.out.println(str4.indexOf("how"));
	System.out.println("--------------------");
	
	//convert something uppercase
	String str5 ="hello everyone";
	System.out.println("after uppercase convertion:" + str5.toUpperCase());
	System.out.println("---------------------");
	
	//convert something lowercase
	String str6 ="HELLO EVERYONE";
	System.out.println("after lowercase convertion:" + str6.toLowerCase());
	System.out.println("---------------------");
	
	//true or false using contains
	
	String str9 = "selenium is a library to automate web application";
	System.out.println("is web application avalable in the str9 String :" +str9.contains("web"));
	boolean checkInString = str9.contains("is");
	
	if(checkInString)
	{
		System.out.println("yes the required string or character is available in give string");
	}else
	{
		System.out.println("No the required string or character is not available in give string");
	}
	
	
	System.out.println("---------------------");
	String str10 = "the transaction no. is - 46ACV657";
	System.out.println("the extracted transaction no. form is:" +str10.substring(27));
	String transactionNo = str10.substring(27);
	System.out.println("Hay your transaction is succesful with id :" +str10.substring(27) + "thanks for being with us");
	
	
	System.out.println("---------------------");
	String str11 = "the transactiob no. is - 43DF65FB76";
	System.out.println("the extracted transaction no. form string is :" + str11.substring(27, 34));
	
	System.out.println("---------------------");
	String statment1 = "Java is platform independent";
	String statment2 = "java is platform independent";
	String statment3 = "Java is platform independent";
	
	System.out.println("Check str1 and str2 :" + statment1.equals(statment2));
	
	System.out.println("---------------------");
	String str14 = "Java is based on object oeriented programming langauge";
	String[] WordsFromStr14 = str14.split(" ");
	for (int j= WordsFromStr14.length-1; j>=0; j--)
	{
		System.out.println(WordsFromStr14[j]);
	}
	
	
	System.out.println("---------------------");
    String str15 = "Java is based on object oeriented programming langauge";
    String[] WordsFromstr15 = str15.split(" ");
    for (int i=0; i<WordsFromstr15.length; i++)
    {
    	System.out.println(WordsFromstr15[i]);
    }
    
    
    System.out.println("---------------------");
    String str16 = "Good&Bye&There";
     String[] testString = str16.split("&");
    		 System.out.println(testString[1]+ " " + testString[0]+ " " + testString[2]);
    		 
    
	
	
	
	
	
	
	
		

	}

}
