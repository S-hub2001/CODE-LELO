class a extends Thread

{
	public void run()
	{
		for(int i=0; i<=5 ; i++) 
		{
			System.out.println("thread is running .... of a"+ i);
		}
	
		System.out.println("exit from thread a");
       }

}

class b extends Thread

{
	public void run()
	{
		for(int i=0; i<=5 ; i++ )
		{
			System.out.println("thread is running .... of a"+ i);
		}
	
		System.out.println("exit from thread a");
    }
}

class Multi

{
	public static void main(String args[])
	{
		a t1= new a();
		b t2= new b();
		t1.start();
		t2.start();
	}
}