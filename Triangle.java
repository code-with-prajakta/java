package hierarchical_inheritance;

public class Triangle extends Shape {
	int base,height;
	
	public Triangle(String name, int side,int base,int height) 
	{
		super(name, side);
		this.base=base;
		this.height=height;
	}
	
	public float tarea()
	{
		return 0.5f*base*height;
	}

}
