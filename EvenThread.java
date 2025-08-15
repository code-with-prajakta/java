package single_thread;

public class EvenThread extends Thread{
	public EvenThread()
	{
		start();
	}
	@Override
	public void run() {
		try {
			for(int i=0; i<=10; i++)
			{
				if(i%2 == 0)
				{
					System.out.print(getName()+" = ");
					System.out.println(i);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
