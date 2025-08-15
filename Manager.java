package multilevel_inheritance;

public class Manager extends Employee {

	String dept,project;
	public Manager(String name, int age, int id, float salary,String project,String dept) {
		super(name, age, id, salary);
		this.dept=dept;
		this.project=project;
	}
	public void dispManager() {
		System.out.println("Department: "+dept);
		System.out.println("Project: "+project);
	}

}
