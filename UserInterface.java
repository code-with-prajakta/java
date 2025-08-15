package program3;

public class UserInterface extends Base implements InterDemo {
	
	public void democlassmethod()
	{
		System.out.println("Child Class Methid ");
	}

	@Override
	public void show() {
		System.out.println("Interface method");
		
	}
	@Override
	public void demo()
	{
		super.demo();
		System.out.println("Another Inmterface method");
	}
	

}
