package single_inheritance;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int age, rollno;
		float per;
		
		System.out.println("Enter Student Details: ");
		System.out.println("Enter Name: ");
		name = sc.next();
		
		System.out.println("Enter Age: ");
		age=sc.nextInt();
		
		System.out.println("Enter Roll No: ");
		rollno=sc.nextInt();
		
	    System.out.println("Enter Persent: ");
	    per = sc.nextFloat();
	    
	    Student obj = new Student(name,age,rollno,per);
	    
	    obj.dispPerson();
	    obj.dispStudent();

	}

}
