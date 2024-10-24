package abstract_method;

public class Derived extends Base{
	@Override
	public void demo()
	{
		System.out.println("this is override abstract method");
	}
	public void disp()
	{
		System.out.println("this is defined method of child");
	}
	@Override
	int addition(int a,int b)
	{
		return a+b;
	}
	

}
