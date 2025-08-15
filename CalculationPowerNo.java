package power_no;

import java.util.Scanner;

public class CalculationPowerNo {

	public static void main(String[] args) {
		
		int n=5,p=3,result=1;
		Scanner sc =new Scanner (System.in);
		
		System.out.println("Enter no. :"+n);
		//n=sc.nextInt();
		System.out.println("Enter 2nd no. :"+p);
		//p=sc.nextInt();
		
		for(int i=1;i<=p;i++) {
			result=n*result;
		}
		System.out.println("Power "+result);
	}

}
