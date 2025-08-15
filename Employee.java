package multilevel_inheritance;

public class Employee extends Person{
	int id;
	float salary;
	
	public Employee(String name, int age,int id,float salary)
	{
		super(age,name);
		this.id=id;
		this.salary=salary;
		
	}
	public void dispEmployee() {
		System.out.println("ID: "+id);
		System.out.println("Salary: "+salary);
	}
	

}
