package com.threadgrp;

public class Racinggrp {

	int count;//car reached 50//
	static int pos=0; //which car won race//
	public void display(ThreadGroup g,String s,String name,int posi)
	{
		for(int i=1;i<101;i++)
		{
			count=i;
			if(count==50)
			{
				System.out.println(g.getName()+name+" "+count+"has reached petrol bunk");
			}
			else if(count==100)
			{
				System.out.println(g.getName()+name+" "+count+"haswon the race"+pos);
			}
			else
			{
				continue;
				
			}
		}
	}
	
	public static class ThreadGroup1 extends Thread
	{
		ThreadGroup g1;
		ThreadGroup1(String name,ThreadGroup g1)
		{
			super(g1,name);
			this.g1=g1;
		}
		public void run()
		{
			pos=++pos;
			Racinggrp rc=new Racinggrp();
			rc.display(g1,"carthread",getName(),rc.pos);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	public static class ThreadGroup2 extends Thread
	{
		ThreadGroup g2;
		ThreadGroup2(String name,ThreadGroup g2)
		{
			super(g2,name);
			this.g2=g2;
		}
		public void run()
		{
			pos=++pos;
			Racinggrp rc=new Racinggrp();
			rc.display(g2,"carthread",getName(),rc.pos);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	
	
	public static class ThreadGroup3 extends Thread
	{
		ThreadGroup g3;
		ThreadGroup3(String name,ThreadGroup g3)
		{
			super(g3,name);
			this.g3=g3;
		}
		public void run()
		{
			pos=++pos;
			Racinggrp rc=new Racinggrp();
			rc.display(g3,"carthread",getName(),rc.pos);
			try{
				Thread.sleep(2000);
			}
			catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}
