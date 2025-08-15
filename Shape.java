package metho_overloading;

public class Shape {

	
		
		float area(float r)
		{
			float result = 3.14f*r*r;
			return result;
		}
		int area(int s)
		{
			int r= s*s;
			return r;
		}
		int area(int l,int b)
		{
			int rs= l*b;
			return rs;
		}
	}


