package hierarchical_inheritance;

public class Square extends Shape
{
    int length;
	public Square(String name, int side,int length) {
		super(name, side);
		this.length=length;
		
	}
	
	public int sarea()
	{
		return length*length;
	}

}
