package fabonosis;

import java.util.Scanner;

public class Fabonosis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,a=0,b=0,c=1;
		System.out.println( "Enter value n:  ");
		n=sc.nextInt();
		
		System.out.println("Fibnacci Series: ");
		for(int i=1;i<=n;i++)
		{
			a=b;
			b=c;
			c =a+b;
			System.out.println(" "+a);
			}	
	}
}
