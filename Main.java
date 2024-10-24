package abstract_method;

public class Main {

	public static void main(String[] args) {
		//base b=new Base();
		Derived obj = new Derived();
		obj.demo();
		obj.disp();
		obj.show();
		System.out.println("Addition= "+obj.addition(10, 20));
	}

}
