package single_inheritance;

  public class Student extends Person 
{
	int rollno;
	float per;
	
	public Student(String name,int age, int rollno, float per)
	{
		super(name,age);
		this.rollno=rollno;
		this.per=per;
		
	}
	
	public void dispStudent()
	{
		System.out.println("Roll No: "+rollno);
		System.out.println("Persent: "+per);
	}
	
}
