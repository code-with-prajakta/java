package vowel;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     char ch;
     System.out.println("Enter character: ");
     ch = sc.next().charAt(0);
     
     if(ch=='a' || ch=='A')
    	 System.out.println("Character is vowel");
     else if(ch=='e' || ch=='E')
    	 System.out.println("Character is vowel");
     else if(ch=='i' || ch=='I')
    	 System.out.println("Character is vowel");
     else if(ch=='o' || ch=='O')
    	 System.out.println("Character is vowel");
     else if(ch=='u' || ch=='U')
    	 System.out.println("Character is vowel");
     else 
    	 System.out.println("Character is consonent ");
     
     
	}

}
