
public class UseInterface implements InterfaceDemo{
	public void democlassmethod()
	{
		System.out.println("child class method");
	}

	@Override
	public void show() {
		System.out.println("Interface show method");
		
	}

	@Override
	public void increamental(int a) {
		a++;
		System.out.println("interface incremental"+a);
		
	}

	@Override
	public void demo() {
		System.out.println("interface demo method");
	}
	

}
