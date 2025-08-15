package factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,fact=1,n;
		System.out.println("Enter number: ");
		n=sc.nextInt();
		
		for(i=1;i<=n;i++) {
			
			fact=fact*i;
		}
		System.out.println("Factorial of is "+fact);

	}

}
