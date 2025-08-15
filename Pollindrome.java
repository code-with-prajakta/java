package pollindrome;

import java.util.Scanner;

public class Pollindrome {

	public static void main(String[] args) {
		//String str,rev="";
		Scanner sc= new Scanner(System.in);
		String str,rev="";
	    System.out.println("Enter String : ");
		
		str=sc.next();
		int length = str.length();
		for(int i=length-1;i>=0;i--)
		rev = rev+str.charAt(i);
		
		if(str.equals(rev))
			System.out.println("the entered string: "+str+" is pollindrome");
		else
		    System.out.println("the Entered String : "+str+ " is not pollindrome");
	 }
}

