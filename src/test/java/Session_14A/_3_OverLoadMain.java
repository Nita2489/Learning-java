package Session_14A;

public class _3_OverLoadMain {

	public static void main(String[] args)
	{
		System.out.println("Hay");
		
		main(10);
		main(10, 20);
	}
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(int a, int b)
	{
		System.out.println(a + b);
	}
	
}
