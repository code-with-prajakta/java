package method_overrriding;

public class Human extends Mamal
{
    //@override
	public void showMamal()
	{
		super.showMamal();
		System.out.println("This is child class displaying Human");
	}
	public void foodhabit(String h)
	{
		System.out.println("Animal is "+h);
	}

	
}
