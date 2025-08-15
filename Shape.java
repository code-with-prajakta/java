package hierarchical_inheritance;

public class Shape {
	String name;
	int side;
	
	public Shape(String name,int side)
	{
		this.name=name;
		this.side=side;
	}
	
	public void dispShape()
	{
		System.out.println("Name = "+name);
		System.out.println("Sides = "+side);
		
	}
	
	

}
