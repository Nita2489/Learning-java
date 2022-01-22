package Session_14;


public class _1_LoginToApplication {
	
	//Overloading - To avoid confusion
	//login - alread stored credientials username, OTP, Username and password, phone no. and password, Un and phone no.
	
	//alredy stored crediential
	
	public void login()
	{
		System.out.println("login to app with alredy stored crediential");
		//logic
	}
	
	public void login(String Username)
	{
		System.out.println("login to app with ->" + Username);
		//logic
	}
	
	public void login(int OTP)
	{
		System.out.println("Login to app with ->" + OTP);
	}
	
	public void login1(String Username, String password)
	{
		System.out.println("Login to app with ->" + Username + password);
	}
	
	public void login2(int phoneNo, String password)
	{
		System.out.println("Login to app with ->" +phoneNo + password);
	}
	
	public void login3(String Username, int phoneNo)
	{
	System.out.println("Login to app with ->" + Username + phoneNo);
	}
	
	
	
	
	
	
	
	
	

}
