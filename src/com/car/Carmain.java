package com.car;

public class Carmain {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Thread1 t1=new Thread1();
		t1.start();
		//ct.sleep(10);
	    Thread2 t2=new  Thread2();
		t2.start();
		Thread3 t3=new Thread3();
		t3.start();
		Thread4 t4=new Thread4();
		t4.start();
		Thread5 t5=new Thread5();
		t5.start();
	    Thread6 t6=new Thread6();
		t6.start();
}
}
