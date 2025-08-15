package staticdemo;

public class StaticDemo {
	int a=0;
	static int b=0;
	public void incrementa()
	{
		a++;
		System.out.println("A"+a);
	}
	public static void incrementb()
	{
		b++;
		System.out.println("B"+b);	
	}

}
