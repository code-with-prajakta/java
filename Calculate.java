package variable_argument;

public class Calculate {
	public int dosum(int...a)
	
	{
		int i,sum=0;
		for(int n:a)
			sum +=n;
     return sum;
	}

}
