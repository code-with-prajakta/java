package switchcase;

import java.util.Scanner;

public class PersentageGrade {

	public static void main(String[] args) {
		String grade = null;
		System.out.println("Enter your Score: ");
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		
		
		switch(score/10)
		{
		case 10:
		case 9:
			grade ="O";
		     break;
		case 8:
			grade="A";
			
		    break;
		case 7:
			grade="B";
			
		    break;
		case 6:
			grade="C";
			
		    break;
		case 5:
			grade="D";
			
		    break;
		default: 
			   grade="F";
			   break;
		}
		System.out.println("your grade is = "+grade);
          
	}

}
