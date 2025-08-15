package first;

public class Base {
	public int a=10;
	private int b=20;
	protected int c=30;
	int d=40;
	
	public void dispBase()
	{
		System.out.println("=========Base=======");
		System.out.println("public "+a);
		System.out.println("private "+b);
		System.out.println("protected "+c);
		System.out.println("default "+d);
	}

}
