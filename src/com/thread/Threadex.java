package com.thread;

public class Threadex extends Thread{
	public void run()
	{
		System.out.println("thread is running");
	}
 public static void main(String[] args) {
	
	 Threadex t1=new Threadex();
	 Threadex t2=new Threadex();
	 Threadex t3=new Threadex();
	 Threadex t4=new Threadex();
	 t1.start();
	 
	 System.out.println("t1 priority is"+t1.getPriority());
	 System.out.println("t2 priority is"+t2.getPriority());
	 System.out.println("t1 priority is"+t3.getPriority());
	 
	 t1.setPriority(5);
	 int a=t1.getPriority();
	 System.out.println("thread priority set ");
	 
	 System.out.println("t1 priority is "+t1.MAX_PRIORITY);
	 System.out.println("t1 priority is "+t1.MIN_PRIORITY);
}
}
