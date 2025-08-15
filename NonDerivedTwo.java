package second;
import first.*;
public class NonDerivedTwo extends Base{
	Base obj= new Base();

	{
		System.out.println("======NonDerivedTwo=========");
		System.out.println("public "+obj.a);
	}

}
