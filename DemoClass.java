package program2;

public class DemoClass implements InterfaceDemo{

	@Override
	public int addition(int x, int y) {
		System.out.println("Interface method addition");
		return x+y;
	}
	public void democlassmethod()
	{
		System.out.println("Child class method");
	}

}
