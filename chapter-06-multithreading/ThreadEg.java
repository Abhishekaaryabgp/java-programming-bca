class A extends Thread
{
	public void run()
	{
		System.out.println("Start of thread A=>=>=>=>");
		for(int i=1; i<=10; i++)
		{
			System.out.println(" i="+i);
		}
		System.out.println("End of thread A****");
	}
}
class B extends Thread 
{
	public void run()
	{
		System.out.println("Start of thread B=>=>=>=>");
		try
		{
			for(int j=1; j<=10; j++)
			{
				System.out.println(" \tj="+j);
				sleep(1000);
			}	
		}
		catch(InterruptedException e)
		{
				System.out.println(e);
		}
		System.out.println("End of thread B****");
	}
}
class C extends Thread 
{
	public void run()
	{
		System.out.println("Start of thread C=>=>=>=>");
		for(int k=1; k<=10; k++)
			System.out.println(" \t\tk="+k);
		System.out.println("End of thread C****");
	}
}
public class ThreadEg
{
	public static void main(String args[]) 
	{		
		A p=new A();
		B q=new B();
		C r=new C();
		
		p.start();
		q.start();
		q.interrupt();
		r.start();
	}
}
