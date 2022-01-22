package Session9;

public class _2_DefaultValues {
public static String str;
public static int i;
public static double d;
public static boolean b;
public static char c;
public static byte z;
public static long l;
public static float f;

	public static void main(String[] args) {
	System.out.println(str); //null
	System.out.println(i);//0
	System.out.println(d);//0.0
	System.out.println(b);//false
	System.out.println(c);//space
	System.out.println(z);//0
	System.out.println(l);//0
	System.out.println(f);//0.0
	
	int p=3;
	System.out.println(p);//local variable
	
	int div1 = 9/3;
	System.out.println(div1);
	
	int div2 = 0/5;
	System.out.println(div2);
	
	int div3 = 6/0;
	System.out.println(div3);
	

	}

}
