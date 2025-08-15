package first;

public class NonDerivedOne {
	public void dispNonDerivedOne()
	{
		Base obj = new Base();
		System.out.println("======nonDerivedOne========");
		System.out.println("public "+obj.a);
		System.out.println("protected "+obj.c);
		System.out.println("default "+obj.d);
	}

}
