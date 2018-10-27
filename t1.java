class t1 implements Runnable
{
synchronized public void run()
	{	try
	{	Thread t=Thread.currentThread();
	String name=t.getName();
	for(int i=0;i<10;i++)
	{
	 System.out.println(name+"="+i);
	Thread.sleep(500);
	if(name.equals("raj") && (i==4))
	{
	  wait();
	}
	if(name.equals("geeta") && (i==4))
	{
	  wait();
	}
	if(name.equals("seeta") && (i==6))
	{
	System.out.println("raj and geeta thread wakes up...");
	  notifyAll(); //it wakes of the waiting thread
		}
	if(name.equals("raj") && (i==9))
	{
	notify();
	}	}
		}catch(Exception e){}
	}
    public static void main(String args[]) throws Exception
{ 
     t1 obj=new t1();
  Thread o1=new Thread(obj,"raj");
 Thread o2=new Thread(obj,"seeta");
 Thread o3=new Thread(obj,"geeta");
        o1.start();       o2.start();       o3.start();
}}


