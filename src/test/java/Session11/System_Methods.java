package Session11;

public class System_Methods {

static String message= " hay there ";

public static void main(String[] args)
{
	//count the length of the string
	System.out.println(message.length());
	
	//remove white spaces
	//System.out.println(message.trim().length());
	
	String newMsg = message.trim();
			System.out.println(newMsg.length());
	
}

}
