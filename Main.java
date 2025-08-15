package variable_argument;

public class Main {

	public static void main(String[] args) {
		Calculate c1= new Calculate();
		System.out.println(c1.dosum(5,6,7));
		System.out.println(c1.dosum(5,6,7,8));
		System.out.println(c1.dosum(5,6,7,8,9));
		
	}

}

