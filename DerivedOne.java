package first;

public class DerivedOne extends Base {
	public void dispDerivedOne()
	{
		System.out.println("=====Derived=======");
		System.out.println("public "+a);
		System.out.println("protected "+c);
		System.out.println("default "+d);
	}

}
