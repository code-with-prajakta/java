package program2;

public interface InterfaceDemo {
	int addition(int x,int y);
	default void display()
	{
		System.out.println("Get number private method : "+getnumber());
		System.out.println("Display method of interface");
	}
	static void mymethod()
	{
	   System.out.println("Static method of interface");
	}
	private int getnumber(){
		int n = 100;
		return n;
	}

}
