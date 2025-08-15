package multi_thread;

public class OddThread extends Thread{
	public OddThread()
	{
	   start();	
	}
	@Override
	public void run()
	{
		try {
			for(int i=0;i<=10;i++) {
				if(i%2 != 0)
				{
					System.out.println(getName()+" =");
					System.out.println(i);
				}
				//Thread.sleep(1000);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
