class Thread1 extends Thread
{
	public Thread1()
	{
		super();
	}
	public Thread1(String s)
	{
		super(s);
	}
	public void run()
	{
		Thread.currentThread().setName("Siya");
		System.out.println("Thread1:"+Thread.currentThread().getName());
	}
}
class Thread2 implements Runnable
{
	public void run()
	{
		System.out.println("Thread2:"+Thread.currentThread().getName());
	}
}
class RunnableEg
{
	public static void main(String[] args)
	{
		Thread1 t1=new Thread1(); //Thread
		Thread2 th1=new Thread2();
		Thread t2=new Thread(th1); //Runnable
		Thread1 t3=new Thread1("Mohit");
		Thread2 th2=new Thread2();
		Thread t4=new Thread(th2,"Saurav");
		System.out.println("main:"+Thread.currentThread().getName());
		Thread.currentThread().setName("Mukhiya");
		System.out.println("main:"+Thread.currentThread().getName());
		//System.out.println(12/0);
		t2.setPriority(8);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		System.out.println(t3.isAlive());
	}
}